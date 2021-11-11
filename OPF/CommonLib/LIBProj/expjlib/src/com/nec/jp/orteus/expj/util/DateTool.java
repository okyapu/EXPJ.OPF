/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/DateTool.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * ���t������̃��[�e�B���e�B�N���X
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:12 $
 */
public class DateTool {

	/**
	 * ���̃N���X��static���\�b�h�݂̂̂ł���A�C���X�^���X���������Ȃ����߂�
	 * �f�t�H���g�R���X�g���N�^��private�Ƃ��Ă��܂��B
	 */
	private DateTool() {
	}

	/**
	 * "yyyy/MM/dd"�`���̓��t��������r���܂��B
	 * @param dateString1 ���t������P
	 * @param dateString2 ���t������Q
	 * @return ���t������P �� ���t������Q �̏ꍇ�� 0��߂��B���t������P �� ���t������Q �̏ꍇ�� 0 ��菬�����l��߂��B���t������P �� ���t������Q �̏ꍇ�� 0 ���傫���l��߂��B
	 * @throws ParseException �p�����[�^�����t������ł͂Ȃ��B
	 */
	public static int compareYMD(String dateString1, String dateString2) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		Date date1 = sdf.parse(dateString1);
		Date date2 = sdf.parse(dateString2);

		return date1.compareTo(date2);
	}

	/**
	 * "yyyy/MM"�`���̓��t��������r���܂��B
	 * @param dateString1 ���t������P
	 * @param dateString2 ���t������Q
	 * @return ���t������P �� ���t������Q �̏ꍇ�� 0��߂��B���t������P �� ���t������Q �̏ꍇ�� 0 ��菬�����l��߂��B���t������P �� ���t������Q �̏ꍇ�� 0 ���傫���l��߂��B
	 * @throws ParseException �p�����[�^�����t������ł͂Ȃ��B
	 */
	public static int compareYM(String dateString1, String dateString2) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM");

		Date date1 = sdf.parse(dateString1);
		Date date2 = sdf.parse(dateString2);

		return date1.compareTo(date2);
	}

	/**
	 * ���t������Ɏw����������Z���܂��B
	 * @param dateString ���t������
	 * @param amountString �w�����
	 * @return ���Z���ʓ��t������
	 * @throws ParseException ���t�����񂪕s���ȏꍇ
	 */
	public static String addDay(String dateString, String amountString) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		Date date = sdf.parse(dateString);
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		int amount = Integer.parseInt(amountString);
		calendar.add(Calendar.DATE, amount);

		return sdf.format(calendar.getTime());
	}

	/**
	 * ���t�����񂩂�w����������Z���܂��B
	 * @param dateString ���t������
	 * @param amountString ����
	 * @return ���Z���ʓ��t������
	 * @throws ParseException ���t�����񂪕s���ȏꍇ
	 */
	public static String subtractDay(String dateString, String amountString)
		throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		Date date = sdf.parse(dateString);
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		int amount = Integer.parseInt(amountString);
		calendar.add(Calendar.DATE, amount * -1);

		return sdf.format(calendar.getTime());
	}

	/**
	 * ���t������Ɏw�茎�������Z���܂��B
	 * @param dateString ���t������
	 * @param amountString �w�茎��
	 * @return ���Z���ʓ��t������
	 * @throws ParseException ���t�����񂪕s���ȏꍇ
	 */
	public static String addMonth(String dateString, String amountString) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		Date date = sdf.parse(dateString);
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		int amount = Integer.parseInt(amountString);
		calendar.add(Calendar.MONTH, amount);

		return sdf.format(calendar.getTime());
	}

	/**
	 * ���t�����񂩂�w�茎�������Z���܂��B
	 * @param dateString ���t������
	 * @param amountString ����
	 * @return ���Z���ʓ��t������
	 * @throws ParseException ���t�����񂪕s���ȏꍇ
	 */
	public static String subtractMonth(String dateString, String amountString)
		throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		Date date = sdf.parse(dateString);
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		int amount = Integer.parseInt(amountString);
		calendar.add(Calendar.MONTH, amount * -1);

		return sdf.format(calendar.getTime());
	}

	/**
	 * ���t������Ɏw��N�������Z���܂��B
	 * @param dateString ���t������
	 * @param amountString �N��
	 * @return ���Z���ʓ��t������
	 * @throws ParseException ���t�����񂪕s���ȏꍇ
	 */
	public static String addYear(String dateString, String amountString) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		Date date = sdf.parse(dateString);
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		int amount = Integer.parseInt(amountString);
		calendar.add(Calendar.YEAR, amount);

		return sdf.format(calendar.getTime());
	}

	/**
	 * ���t�����񂩂�w��N�������Z���܂��B
	 * @param dateString ���t������
	 * @param amountString �N��
	 * @return ���Z���ʓ��t������
	 * @throws ParseException ���t�����񂪕s���ȏꍇ
	 */
	public static String subtractYear(String dateString, String amountString)
		throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		Date date = sdf.parse(dateString);
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		int amount = Integer.parseInt(amountString);
		calendar.add(Calendar.YEAR, amount * -1);

		return sdf.format(calendar.getTime());
	}
}
