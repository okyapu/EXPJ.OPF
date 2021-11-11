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
 * ���t�f�[�^�̌^�ϊ��N���X
 * �@Date���t��String���t�AString���t��Date���t�ւ̕ϊ����s���܂��B
 * �@����сAString���l�̊ۂ߂��s���܂��B
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:11 $
*/

public class Converter {

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
	 * �`���iyyyyMMdd HH:mm:ss�j
	*/
	public final static String DATE_TIME = "yyyyMMdd HH:mm:ss";

	/**
	 * �`���iyyyy/MM/dd HHmm�j
	*/
	public final static String SLASH_DATE_HOUR_MINUTE = "yyyy/MM/dd HHmm";

	/**
	 * �`���iyyyy/MM/dd HH:mm�j
	*/
	public final static String SLASH_DATE_HOUR_COLON_MINUTE = "yyyy/MM/dd HH:mm";
	
	/**
	 * ���̖�����ɋ߂Â��悤�Ɋۂ߂郂�[�h�ł��B
	 * BigDecimal �����̏ꍇ�� ROUND_UP �̂悤�ɓ��삵�A
	 * ���̏ꍇ�� ROUND_DOWN �̂悤�ɓ��삵�܂��B
	 * ���̊ۂ߃��[�h�́A�v�Z���ꂽ�l�����炵�܂���B
	 */
	public final static int ROUND_CEILING = BigDecimal.ROUND_CEILING;

	/**
	 * 0 �ɋ߂Â��悤�Ɋۂ߂郂�[�h�ł��B
	 * �j������鏬�����ɐ�s���錅�𑝕����܂��� (�܂�؂�̂�)�B
	 * ���̊ۂ߃��[�h�́A�v�Z���ꂽ�l�̐�Βl�𑝂₵�܂���B
	 */
	public final static int ROUND_DOWN = BigDecimal.ROUND_DOWN;

	/**
	 * ���̖�����ɋ߂Â��悤�Ɋۂ߂郂�[�h�ł��B
	 * BigDecimal �����̏ꍇ�� ROUND_DOWN �̂悤�ɓ��삵�A
	 * ���̏ꍇ�� ROUND_UP �̂悤�ɓ��삵�܂��B
	 * ���̊ۂ߃��[�h�́A�v�Z���ꂽ�l�𑝂₵�܂���B
	 */
	public final static int ROUND_FLOOR = BigDecimal.ROUND_FLOOR;

	/**
	 * �u�����Ƃ��߂������v �Ɋۂ߂郂�[�h�ł��B
	 * �������A���ׂ�̐������������̏ꍇ�͐؂�̂Ă܂��B
	 * �j������鏬������ .5 �𒴂���ꍇ�� ROUND_UP �̂悤�ɓ��삵�A
	 * ����ȊO�̏ꍇ�� ROUND_DOWN �̂悤�ɓ��삵�܂��B
	 */
	public final static int ROUND_HALF_DOWN = BigDecimal.ROUND_HALF_DOWN;

	/**
	 * �u�����Ƃ��߂������v �Ɋۂ߂郂�[�h�ł��B
	 * �������A���ׂ�̐������������̏ꍇ�͋������Ɋۂ߂܂��B
	 * �j�����鏬�����̍��ӂ̌�����̏ꍇ�� ROUND_HALF_UP �̂悤�ɓ��삵�A
	 * �����̏ꍇ�� ROUND_HALF_DOWN �̂悤�ɓ��삵�܂��B
	 * ���̊ۂ߃��[�h�́A�A������v�Z�ŌJ��Ԃ��K�p�����ꍇ�ɗݐσG���[���ŏ��ɂ��܂��B
	 */
	public final static int ROUND_HALF_EVEN = BigDecimal.ROUND_HALF_EVEN;

	/**
	 * �u�����Ƃ��߂������v�Ɋۂ߂郂�[�h�ł��B
	 * �������A���ׂ�̐������������̏ꍇ�͐؂�グ�܂��B
	 * �j������鏬������ .5 �ȏ�̏ꍇ�� ROUND_UP �̂悤�ɓ��삵�A
	 * ����ȊO�̏ꍇ�� ROUND_DOWN �̂悤�ɓ��삵�܂��B����͉�X�̑唼�����w�Z�ŏK�����؂�グ�̂��Ƃł��B
	 */
	public final static int ROUND_HALF_UP = BigDecimal.ROUND_HALF_UP;

	/**
	 * �v������鉉�Z�̌��ʂ����m�ł���A
	 * �ۂ߂��K�v�łȂ����Ƃ�\���ۂ߃��[�h�ł��B
	 * ���̊ۂ߃��[�h�����ʂ����m�łȂ����Z�Ŏw�肳���ꍇ�́AArithmeticException ���X���[����܂��B
	 */
	public final static int ROUND_UNNECESSARY = BigDecimal.ROUND_UNNECESSARY;

	/**
	 * 0 ���痣���悤�Ɋۂ߂郂�[�h�ł��B
	 * �j������� 0 �ȊO�̏������ɐ�s���錅����ɑ��₵�܂��B
	 * ���̊ۂ߃��[�h�́A�v�Z���ꂽ�l�̐�Βl�����炵�܂���B
	 */
	public final static int ROUND_UP = BigDecimal.ROUND_UP;

	/**
	 * Date���t���w�肳�ꂽ�`���Ńt�H�[�}�b�g���܂��B<br>
	 * 		��FdateToStr(Date,SLASH_DATE) -> "2004/01/02"<br>
	 * 		�@�@dateToStr(Date,SLASH_DATE_TIME) -> "2004/01/02 03:04:05"<br>
	 * 		�@�@dateToStr(Date,DATE) -> "20040102"<br>
	 * 		�@�@dateToStr(Date,DATE_TIME) -> "20040102 03:04:05"<br>
	 * @param date ���t<br>
	 * @param type �`���iCommon�N���X����`�ȊO�̌`���ł��\�j<br>
	 * 		�@�@SLASH_DATE : "yyyy/MM/dd"<br>
	 * 		�@�@SLASH_DATE_TIME : "yyyy/MM/dd hh:mm:ss"<br>
	 * 		�@�@DATE : "yyyyMMdd"<br>
	 * 		�@�@DATE_TIME : "yyyyMMdd hh:mm:ss"
	 * @return	�t�H�[�}�b�g���ꂽ���t������
	 */
	public static synchronized String dateToStr(Date date, String type) {
		if (date == null || type == null || type.length() == 0){
			return null;
		}
		Converter conv = new Converter();
		return conv.dateToStr2(date, type);
	}

	/**
	 * Date���t���w�肳�ꂽ�`���Ńt�H�[�}�b�g���܂��B<br>
	 * @param date ���t<br>
	 * @param type �`��<br>
	 * @return	�t�H�[�}�b�g���ꂽ���t������
	 */
	private String dateToStr2(Date date, String type) {
		SimpleDateFormat sdf = new SimpleDateFormat(type);
		return sdf.format(date);
	}

	/**
	 * String���t���w�肳�ꂽ�t�H�[�}�b�g��Date���t�ɕϊ����܂��B<br>
	 * 		��FstrToDate("2004/01/02",SLASH_DATE) -> Date<br>
	 * 		�@�@strToDate("2004/01/02 03:04:05",SLASH_DATE_TIME) -> Date<br>
	 * 		�@�@strToDate("20040102",DATE) -> Date<br>
	 * 		�@�@strToDate("20040102 03:04:05",DATE_TIME) -> Date<br>
	 * @param str ���t������<br>
	 * @param type   �`���i�N���X����`�ȊO�̌`���ł��\�j<br>
	 * 		�@�@SLASH_DATE : "yyyy/MM/dd"<br>
	 * 		�@�@SLASH_DATE_TIME : "yyyy/MM/dd hh:mm:ss"<br>
	 * 		�@�@DATE : "yyyyMMdd"<br>
	 * 		�@�@DATE_TIME : "yyyyMMdd hh:mm:ss"
	 * @return	Date���t
	 * @throws ParseException str �� �t�H�[�}�b�g�� type �ƈ�v���Ȃ��ꍇ
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
	 * String���t���w�肳�ꂽ�t�H�[�}�b�g��Date���t�ɕϊ����܂��B<br>
	 * @param str ���t������<br>
	 * @param type   �`��<br>
	 * @return	Date���t
	 * @throws ParseException str �� �t�H�[�}�b�g�� type �ƈ�v���Ȃ��ꍇ
	 */
	private Date strToDate2(String str, String type)
			throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(type);
		return sdf.parse(str);
	}

	/**
	 * String���l���w�肳�ꂽ�t�H�[�}�b�g�ɕϊ����܂��B<br>
	 * 		��FROUND_CEILING<br>
	 * 		�@�@�@�@strToDec(1.4545,0,ROUND_CEILING) -> 2<br>
	 * 		�@�@�@�@strToDec(1.4545,1,ROUND_CEILING) -> 1.5<br>
	 * 		�@�@�@�@strToDec(1.4545,2,ROUND_CEILING) -> 1.46<br>
	 * 		�@�@�@�@strToDec(1.4545,3,ROUND_CEILING) -> 1.455<br>
	 * 		�@�@�@�@strToDec(-1.4545,0,ROUND_CEILING) -> -1<br>
	 * 		�@�@�@�@strToDec(-1.4545,1,ROUND_CEILING) -> -1.4<br>
	 * 		�@�@�@�@strToDec(-1.4545,2,ROUND_CEILING) -> -1.45<br>
	 * 		�@�@�@�@strToDec(-1.4545,3,ROUND_CEILING) -> -1.454<br>
	 * 		�@�@ROUND_DOWN<br>
	 * 		�@�@�@�@strToDec(1.4545,0,ROUND_DOWN) -> 1<br>
	 * 		�@�@�@�@strToDec(1.4545,1,ROUND_DOWN) -> 1.4<br>
	 * 		�@�@�@�@strToDec(1.4545,2,ROUND_DOWN) -> 1.45<br>
	 * 		�@�@�@�@strToDec(1.4545,3,ROUND_DOWN) -> 1.454<br>
	 * 		�@�@�@�@strToDec(-1.4545,0,ROUND_DOWN) -> -1<br>
	 * 		�@�@�@�@strToDec(-1.4545,1,ROUND_DOWN) -> -1.4<br>
	 * 		�@�@�@�@strToDec(-1.4545,2,ROUND_DOWN) -> -1.45<br>
	 * 		�@�@�@�@strToDec(-1.4545,3,ROUND_DOWN) -> -1.454<br>
	 * 		�@�@ROUND_FLOOR<br>
	 * 		�@�@�@�@strToDec(1.4545,0,ROUND_FLOOR) -> 1<br>
	 * 		�@�@�@�@strToDec(1.4545,1,ROUND_FLOOR) -> 1.4<br>
	 * 		�@�@�@�@strToDec(1.4545,2,ROUND_FLOOR) -> 1.45<br>
	 * 		�@�@�@�@strToDec(1.4545,3,ROUND_FLOOR) -> 1.454<br>
	 * 		�@�@�@�@strToDec(-1.4545,0,ROUND_FLOOR) -> -2<br>
	 * 		�@�@�@�@strToDec(-1.4545,1,ROUND_FLOOR) -> -1.5<br>
	 * 		�@�@�@�@strToDec(-1.4545,2,ROUND_FLOOR) -> -1.46<br>
	 * 		�@�@�@�@strToDec(-1.4545,3,ROUND_FLOOR) -> -1.455<br>
	 * 		�@�@ROUND_HALF_DOWN<br>
	 * 		�@�@�@�@strToDec(1.4545,0,ROUND_HALF_DOWN) -> 1<br>
	 * 		�@�@�@�@strToDec(1.4545,1,ROUND_HALF_DOWN) -> 1.5<br>
	 * 		�@�@�@�@strToDec(1.4545,2,ROUND_HALF_DOWN) -> 1.45<br>
	 * 		�@�@�@�@strToDec(1.4545,3,ROUND_HALF_DOWN) -> 1.454<br>
	 * 		�@�@�@�@strToDec(-1.4545,0,ROUND_HALF_DOWN) -> -1<br>
	 * 		�@�@�@�@strToDec(-1.4545,1,ROUND_HALF_DOWN) -> -1.5<br>
	 * 		�@�@�@�@strToDec(-1.4545,2,ROUND_HALF_DOWN) -> -1.45<br>
	 * 		�@�@�@�@strToDec(-1.4545,3,ROUND_HALF_DOWN) -> -1.454<br>
	 * 		�@�@ROUND_HALF_DOWN<br>
	 * 		�@�@�@�@strToDec(1.4545,0,ROUND_HALF_DOWN) -> 1<br>
	 * 		�@�@�@�@strToDec(1.4545,1,ROUND_HALF_DOWN) -> 1.5<br>
	 * 		�@�@�@�@strToDec(1.4545,2,ROUND_HALF_DOWN) -> 1.45<br>
	 * 		�@�@�@�@strToDec(1.4545,3,ROUND_HALF_DOWN) -> 1.454<br>
	 * 		�@�@�@�@strToDec(-1.4545,0,ROUND_HALF_DOWN) -> -1<br>
	 * 		�@�@�@�@strToDec(-1.4545,1,ROUND_HALF_DOWN) -> -1.5<br>
	 * 		�@�@�@�@strToDec(-1.4545,2,ROUND_HALF_DOWN) -> -1.45<br>
	 * 		�@�@�@�@strToDec(-1.4545,3,ROUND_HALF_DOWN) -> -1.454<br>
	 * 		�@�@ROUND_HALF_EVEN<br>
	 * 		�@�@�@�@strToDec(1.4545,0,ROUND_HALF_EVEN) -> 1<br>
	 * 		�@�@�@�@strToDec(1.4545,1,ROUND_HALF_EVEN) -> 1.5<br>
	 * 		�@�@�@�@strToDec(1.4545,2,ROUND_HALF_EVEN) -> 1.45<br>
	 * 		�@�@�@�@strToDec(1.4545,3,ROUND_HALF_EVEN) -> 1.454<br>
	 * 		�@�@�@�@strToDec(-1.4545,0,ROUND_HALF_EVEN) -> -1<br>
	 * 		�@�@�@�@strToDec(-1.4545,1,ROUND_HALF_EVEN) -> -1.5<br>
	 * 		�@�@�@�@strToDec(-1.4545,2,ROUND_HALF_EVEN) -> -1.45<br>
	 * 		�@�@�@�@strToDec(-1.4545,3,ROUND_HALF_EVEN) -> -1.454<br>
	 * 		�@�@ROUND_HALF_UP<br>
	 * 		�@�@�@�@strToDec(1.4545,0,ROUND_HALF_UP) -> 1<br>
	 * 		�@�@�@�@strToDec(1.4545,1,ROUND_HALF_UP) -> 1.5<br>
	 * 		�@�@�@�@strToDec(1.4545,2,ROUND_HALF_UP) -> 1.45<br>
	 * 		�@�@�@�@strToDec(1.4545,3,ROUND_HALF_UP) -> 1.455<br>
	 * 		�@�@�@�@strToDec(-1.4545,0,ROUND_HALF_UP) -> -1<br>
	 * 		�@�@�@�@strToDec(-1.4545,1,ROUND_HALF_UP) -> -1.5<br>
	 * 		�@�@�@�@strToDec(-1.4545,2,ROUND_HALF_UP) -> -1.45<br>
	 * 		�@�@�@�@strToDec(-1.4545,3,ROUND_HALF_UP) -> -1.455<br>
	 * 		�@�@ROUND_UNNECESSARY<br>
	 * 		�@�@�@�@strToDec(1.4545,1,ROUND_UNNECESSARY) -> ArithmeticException<br>
	 * 		�@�@�@�@strToDec(1.4545,4,ROUND_UNNECESSARY) -> 1.4545<br>
	 * 		�@�@ROUND_UP<br>
	 * 		�@�@�@�@strToDec(1.4545,0,ROUND_UP) -> 2<br>
	 * 		�@�@�@�@strToDec(1.4545,1,ROUND_UP) -> 1.5<br>
	 * 		�@�@�@�@strToDec(1.4545,2,ROUND_UP) -> 1.46<br>
	 * 		�@�@�@�@strToDec(1.4545,3,ROUND_UP) -> 1.455<br>
	 * 		�@�@�@�@strToDec(-1.4545,0,ROUND_UP) -> -2<br>
	 * 		�@�@�@�@strToDec(-1.4545,1,ROUND_UP) -> -1.5<br>
	 * 		�@�@�@�@strToDec(-1.4545,2,ROUND_UP) -> -1.46<br>
	 * 		�@�@�@�@strToDec(-1.4545,3,ROUND_UP) -> -1.455
	 * @param str ���l������
	 * @param scale �X�P�[��
	 * @param roundingMode   �`���i�K�p����ۂ߃��[�h�j<br>
	 * 		�@�@ROUND_CEILING<br>
	 *  	�@�@ROUND_DOWN<br>
	 * 		�@�@ROUND_FLOOR<br>
	 * 		�@�@ROUND_HALF_DOWN<br>
	 * 		�@�@ROUND_HALF_EVEN<br>
	 * 		�@�@ROUND_HALF_UP<br>
	 * 		�@�@ROUND_UNNECESSARY<br>
	 * 		�@�@ROUND_UP
	 * @return       BigDecimal�l
	 * @throws NullPointerException str �� null �̏ꍇ
	 * @throws ArithmeticException roundingMode=ROUND_UNNECESSARY �ŁAstr �̊ۂ߂��K�v�ȏꍇ
	 */
	public static BigDecimal strToDec(String str, int scale, int roundingMode) {
		BigDecimal dec = new BigDecimal(str);
		return dec.setScale(scale, roundingMode);
	}

	/**
	 * ���ꕶ���ϊ�
	 * �@& �� &amp;
	 * �@< �� &lt;
	 * �@> �� &gt;
	 * �@" �� &34;
	 * �@' �� &39;
	 *  ���p�� �� &nbsp;
	 * @param str ������
	 * @return ���ꕶ���C���㕶����
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
