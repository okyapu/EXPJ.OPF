//------------------------------------------------------------------------------
// (#)Calculate.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/08/28 �V�K�쐬 Y.Inada
// 2003/08/28 Y.Inada
//            �������菈���A�������菈���A�召��r�����ǉ�
// 2003/09/01 Y.Inada
//            �؏�A�؎̂āA�l�̌ܓ����{���A
//            BigDecimal��setScale()���\�b�h���g�p����悤�C��
//            ���l��������t�H�[�}�b�g���郁�\�b�h�ǉ�
// 2003/09/04 Y.Inada
//            �����̗L���������w��ł��銄�Z���\�b�h�ǉ�
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.util;

import java.math.BigDecimal;
import java.lang.NumberFormatException;

/**
 * ���Z�N���X�B
 *
 * @author  Y.Inada
 * @version 1.00
*/
public class Calculate
{
	/**
	  * ���Z�̍\�z�B
	*/
	public Calculate(){}

	/**
	 * ���Z
	 * @param num1 ����������
	 * @param num2 ����������
	 * @return �v�Z����(num1 + num2)
	 */
	public static String add(String num1, String num2)
	{
		BigDecimal b_num1 = new BigDecimal(num1);
		BigDecimal b_num2 = new BigDecimal(num2);
		BigDecimal result = b_num1.add(b_num2);
		return eliminate(result.toString());
	}

	/**
	 * ���Z
	 * @param num1 ����������
	 * @param num2 ����������
	 * @return �v�Z����(num1 - num2)
	 */
	public static String subtract(String num1, String num2)
	{
		BigDecimal b_num1 = new BigDecimal(num1);
		BigDecimal b_num2 = new BigDecimal(num2);
		BigDecimal result = b_num1.subtract(b_num2);
		return eliminate(result.toString());
	}

	/**
	 * �|�Z
	 * @param num1 ����������
	 * @param num2 ����������
	 * @return �v�Z����(num1 * num2)
	 */
	public static String multiply(String num1, String num2)
	{
		BigDecimal b_num1 = new BigDecimal(num1);
		BigDecimal b_num2 = new BigDecimal(num2);
		BigDecimal result = b_num1.multiply(b_num2);
		return eliminate(result.toString());
	}

	/**
	 * ���Z
	 * @param num1 ����������
	 * @param num2 ����������
	 * @param type �؏グ�A�؎̂āA�l�̌ܓ�
	 * @return �v�Z����(num1 / num2)
	 */
	public static String divide(String num1, String num2, int type)
	{
		BigDecimal b_num1 = new BigDecimal(num1);
		BigDecimal b_num2 = new BigDecimal(num2);
		BigDecimal result = b_num1.divide(b_num2, type);
		return eliminate(result.toString());
	}

	/**
	 * ���Z
	 * @param num1 ����������
	 * @param num2 ����������
	 * @param figure �����̗L������
	 * @param type �؏グ�A�؎̂āA�l�̌ܓ�
	 * @return �v�Z����(num1 / num2)
	 */
	public static String divide(String num1, String num2, int figure, int type)
	{
		BigDecimal b_num1 = new BigDecimal(num1);
		BigDecimal b_num2 = new BigDecimal(num2);
		BigDecimal result = b_num1.divide(b_num2, figure, type);
		return eliminate(result.toString());
	}

	/**
	 * �؏グ
	 * @param num ����������
	 * @param figure �����̗L������
	 */
	public static String ceil(String num, int figure)
	{
		BigDecimal val = new BigDecimal(num);
		BigDecimal result = val.setScale(figure, _CEIL);
		return eliminate(result.toString());
	}

	/**
	 * �؎̂�
	 * @param num ����������
	 * @param figure �����̗L������
	 */
	public static String floor(String num, int figure)
	{
		BigDecimal val = new BigDecimal(num);
		BigDecimal result = val.setScale(figure, _FLOOR);
		return eliminate(result.toString());
	}

	/**
	 * �l�̌ܓ�
	 * @param num ����������
	 * @param figure �����̗L������
	 */
	public static String round(String num, int figure)
	{
		BigDecimal val = new BigDecimal(num);
		BigDecimal result = val.setScale(figure, _ROUND);
		return eliminate(result.toString());
	}


	/**
	 * �����`�F�b�N
	 * @param num ����������
	 * @return true:����  false:�����ȊO
	 */
	public static boolean isNumeric(String num)
	{
		// ���l����
		try{
			BigDecimal buff = new BigDecimal(num);
		}catch(NumberFormatException ex){
			return false;		// ���l�łȂ��ꍇ
		}

		int index = num.indexOf(".");			// �����_�̈ʒu

		if(index == -1) return false;			// �����̏ꍇ

		int length = num.length();				// ���������̒���
		int s_length = length - index -1;		// �����_����̒���

		String s_lower = num.substring(index + 1, num.length());
		s_lower = "0." + s_lower;

		if(compare(s_lower, "0") == 0)
			return false;
		else
			return true;
	}

	/**
	 * �����`�F�b�N
	 * @param num ����������
	 * @return true:���� false:�����ȊO
	 */
	public static boolean isInteger(String num)
	{
		// ���l����
		try{
			BigDecimal buff = new BigDecimal(num);
		}catch(NumberFormatException ex){
			return false;		// ���l�łȂ��ꍇ
		}

		int index = num.indexOf(".");		// �����_�̈ʒu

		if(index == -1){
			 return true;					// �����̏ꍇ
		}
		else{
			int length = num.length();				// ���������̒���
			int s_length = length - index -1;		// �����_����̒���
	
			String s_lower = num.substring(index + 1, num.length());
			s_lower = "0." + s_lower;
	
			if(compare(s_lower, "0") != 0)
				return false;
			else
				return true;
		}
	}

	/**
	 * ��r�B
	 * @param num ����������
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
	 * �t�H�[�}�b�g�B
	 * @param num ����������
	 * @param figure �t�H�[�}�b�g����
	 * @return  �t�H�[�}�b�g��̐���������
	 */
	public static String formatNumric(String num, int figure)

	{
		if(figure <= 0)
			return num;		// �L��������0�ȉ��̏ꍇ�A�I��

		if(isInteger(num) == false && isNumeric(num) == false)
			return num;		// ���l�łȂ��ꍇ�A�I��

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
	 * �t�H�[�}�b�g�B
	 * @param num ����������
	 * @return  �t�H�[�}�b�g��̐���������
	 */
	public static String formatInteger(String num)

	{
		if(isInteger(num) == false)
			return num;		// �����łȂ��ꍇ�A�I��

		int index = num.indexOf(".");		// �����_�̈ʒu
		if(index == -1){
			 return num;					// ���������Ȃ��ꍇ
		}

		String s_upper = num.substring(0, index);		// �������폜
		return s_upper;
	}


	/**
	 * ��������'0'�폜
	 * @param ����������
	 * @return '0'�폜��������������
	 */
	private static String eliminate(String num)
	{
		// �����_�̈ʒu�擾
		int index = num.indexOf(".");

		if(index== -1) return num;	// ���������Ȃ��ꍇ

		// ������������ꍇ '0'�폜
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


	/** �؂�グ */
	public final static int _CEIL = BigDecimal.ROUND_UP;

	/** �؎̂� */
	public final static int _FLOOR = BigDecimal.ROUND_DOWN;

	/** �l�̌ܓ� */
	public final static int _ROUND = BigDecimal.ROUND_HALF_UP;

}

