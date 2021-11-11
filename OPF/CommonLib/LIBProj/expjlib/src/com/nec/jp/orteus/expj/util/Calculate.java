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
 * ���Z�N���X
 * ������̉��Z���s���܂��B
 *
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.4 $ $Date: 2011/03/31 05:34:42 $
*/

public class Calculate {

	/**
	 * �؂�グ
	 */
	public final static int CEIL = BigDecimal.ROUND_UP;

	/**
	 * �؎̂�
	 */
	public final static int FLOOR = BigDecimal.ROUND_DOWN;

	/**
	 * �l�̌ܓ�
	 */
	public final static int ROUND = BigDecimal.ROUND_HALF_UP;

	/**
	 * ���Z�̍\�z�B
	*/
	public Calculate() {}

	/**
	 * ���Z  num1 �� num2 ���A���l�Ƃ��đ��Z���A���ʂ𐔎�������Ƃ��ĕԂ��܂��B<br>
	 *      ��F add("10","1.2") -> "11.2"
	 * @param num1 ����������
	 * @param num2 ����������
	 * @return �v�Z����(num1 + num2)
	 * @throws NullPointerException num1�܂���num2 �� null �̏ꍇ
	 * @throws NumberFormatException num1�܂���num2 �� �����ȊO�̏ꍇ
	 */
	public static String add(String num1, String num2) {
		BigDecimal b_num1 = new BigDecimal(num1);
		BigDecimal b_num2 = new BigDecimal(num2);
		BigDecimal result = b_num1.add(b_num2);
		return eliminate(result.toString());
	}

	/**
	 * ���Z�@num1 ��� num2 ���A���l�Ƃ��Ĉ��Z���s���A���ʂ𐔎�������Ƃ��ĕԂ��܂��B<br>
	 * 		��F  subtract("10","2.1") -> "7.9"
	 * @param num1 ����������
	 * @param num2 ����������
	 * @return �v�Z����(num1 - num2)
	 * @throws NullPointerException num1�܂���num2 �� null �̏ꍇ
	 * @throws NumberFormatException num1�܂���num2 �� �����ȊO�̏ꍇ

	 */
	public static String subtract(String num1, String num2) {
		BigDecimal b_num1 = new BigDecimal(num1);
		BigDecimal b_num2 = new BigDecimal(num2);
		BigDecimal result = b_num1.subtract(b_num2);
		return eliminate(result.toString());
	}

	/**
	 * �|�Z�@num1 �� num2 ���A���l�Ƃ��Ċ|�Z���s���A���ʂ𐔎�������Ƃ��ĕԂ��܂��B<br>
	 * 		��F   multiply("0.1","3") -> "0.3"
	 * @param num1 ����������
	 * @param num2 ����������
	 * @return �v�Z����(num1 * num2)
	 * @throws NullPointerException num1�܂���num2 �� null �̏ꍇ
	 * @throws NumberFormatException num1�܂���num2 �� �����ȊO�̏ꍇ
	 */
	public static String multiply(String num1, String num2) {
		BigDecimal b_num1 = new BigDecimal(num1);
		BigDecimal b_num2 = new BigDecimal(num2);
		BigDecimal result = b_num1.multiply(b_num2);
		return eliminate(result.toString());
	}

	/**
	 * ���Z�@num1 �� num2 �ŁA���l�Ƃ��Ċ��Z���s���A���ʂ𐔎�������Ƃ��ĕԂ��܂��B<br>
	 * type ���A�؏グ(CEIL)�̎��́A�����_��P���ڂ�؂�グ�܂��B<br>
	 * �؎̂�(FLOOR)�̎��́A�����_��P���ڂ�؂�̂Ă܂��B<br>
	 * �l�̌ܓ�(ROUND)�̎��́A�����_��P���ڂ��l�̌ܓ����܂��B<br>
	 * 		��F�@�@divide("14","10",CEIL) -> "2"<br>
	 * 		�@�@�@�@divide("15","10",FLOOR) -> "1"<br>
	 * 		�@�@�@�@divide("15","10",ROUND) -> "2"<br>
	 * @param num1 ����������
	 * @param num2 ����������
	 * @param type �؏グ(CEIL)�A�؎̂�(FLOOR)�A�l�̌ܓ�(ROUND)
	 * @return �v�Z����(num1 / num2)
	 * @throws NullPointerException num1�܂���num2 �� null �̏ꍇ
	 * @throws NumberFormatException num1�܂���num2 �� �����ȊO�̏ꍇ
	 */
	public static String divide(String num1, String num2, int type) {
		BigDecimal b_num1 = new BigDecimal(num1);
		BigDecimal b_num2 = new BigDecimal(num2);
		BigDecimal result = b_num1.divide(b_num2, type);
		return eliminate(result.toString());
	}

	/**
	 * ���Znum1 �� num2 �ŁA���l�Ƃ��Ċ��Z���s���A���ʂ𐔎�������Ƃ��ĕԂ��܂��B<br>
	 * type ���A�؏グ(CEIL)�̎��́Afigure(�����̗L������)�̌���؂�グ�܂��B<br>
	 * �؎̂�(FLOOR)�̎��́Afigure(�����̗L������)�̌���؂�̂Ă܂��B<br>
	 * �l�̌ܓ�(ROUND)�̎��́Afigure(�����̗L������)�̌����l�̌ܓ����܂��B<br>
	 * 		��F�@�@divide("14.5","10",1,CEIL) -> "1.5"<br>
	 * 		�@�@�@�@divide("14.5","10",1,FLOOR) -> "1.4"<br>
	 * 		�@�@�@�@divide("14.5","10",1,ROUND) -> "1.5"<br>
	 * @param num1 ����������
	 * @param num2 ����������
	 * @param figure �����̗L������ 0�ȏ�̗L���Ȓl
	 * @param type �؏グ(CEIL)�A�؎̂�(FLOOR)�A�l�̌ܓ�(ROUND)
	 * @return �v�Z����(num1 / num2)
	 * @throws NullPointerException num1�܂���num2 �� null �̏ꍇ
	 * @throws NumberFormatException num1�܂���num2 �� �����ȊO�̏ꍇ
	 * @throws ArithmeticException - num2 �� 0 �̏ꍇ �܂��� figure �� 0 ��菬�����ꍇ
	 */
	public static String divide(String num1, String num2, int figure, int type) {
		BigDecimal b_num1 = new BigDecimal(num1);
		BigDecimal b_num2 = new BigDecimal(num2);
		BigDecimal result = b_num1.divide(b_num2, figure, type);
		return eliminate(result.toString());
	}

	/**
	 * �؏グ�@num �� figure(�����̗L������) �ŁA�؏グ���܂��B<br>
	 * 		��Fceil("1.12",0) -> "2"<br>
	 * 		�@�@ceil("1.12",1) -> "1.2"<br>
	 * @param num ����������@0�ȏ�̗L���Ȑ��l
	 * @param figure �����̗L������
	 * @throws NullPointerException num �� null �̏ꍇ
	 * @throws NumberFormatException num �������ȊO�̏ꍇ
	 * @throws ArithmeticException figure �� 0 ��菬�����ꍇ
	 */
	public static String ceil(String num, int figure) {
		BigDecimal val = new BigDecimal(num);
		BigDecimal result = val.setScale(figure, CEIL);
		return eliminate(result.toString());
	}

	/**
	 * �؎̂ā@num �� figure(�����̗L������) �ŁA�؎̂Ă��܂��B<br>
	 * 		��Ffloor("1.12",0) -> "1"<br>
	 * 		�@�@floor("1.12",1) -> "1.1"<br>
	 * @param num ����������
	 * @param figure �����̗L�������@0�ȏ�̗L���Ȑ��l
	 * @throws NullPointerException num �� null �̏ꍇ
	 * @throws NumberFormatException num �������ȊO�̏ꍇ
	 * @throws ArithmeticException figure �� 0 ��菬�����ꍇ
	 */
	public static String floor(String num, int figure) {
		BigDecimal val = new BigDecimal(num);
		BigDecimal result = val.setScale(figure, FLOOR);
		return eliminate(result.toString());
	}

	/**
	 * �l�̌ܓ��@num �� figure(�����̗L������) �ŁA�l�̌ܓ����܂��B<br>
	 * 		��Fround("1.454",0) -> "1"<br>
	 * 		�@�@round("1.454",1) -> "1.5"<br>
	 * 		�@�@round("1.454",2) -> "1.45"<br>
	 * @param num ����������
	 * @param figure �����̗L�������@0�ȏ�̗L���Ȑ��l
	 * @throws NullPointerException num �� null �̏ꍇ
	 * @throws NumberFormatException num �������ȊO�̏ꍇ
	 * @throws ArithmeticException figure �� 0 ��菬�����ꍇ
	 */
	public static String round(String num, int figure) {
		BigDecimal val = new BigDecimal(num);
		BigDecimal result = val.setScale(figure, ROUND);
		return eliminate(result.toString());
	}

	/**
	 * �����`�F�b�N�@num �ɁA�����_�ȉ��̒l���܂ޏꍇ�́Atrue�B�����_�ȉ��̒l
	 * ���܂܂Ȃ��ꍇ�́Afalse ��Ԃ��܂��Bnum ���A���l�ȊO�̏ꍇ���Afalse��Ԃ��܂��B<br>
	 * 		��FisNumeric("0") -> false<br>
	 * 		�@�@isNumeric("0.0") -> false<br>
	 * 		�@�@isNumeric("0.1") -> true<br>
	 * @param num ����������
	 * @return true:����  false:�����ȊO
	 * @throws NullPointerException num �� null �̏ꍇ
	 */
	public static boolean isNumeric(String num) {
		// ���l����
		try{
			BigDecimal buff = new BigDecimal(num);
		}catch(NumberFormatException ex){
			return false;		// ���l�łȂ��ꍇ
		}

		int index = num.indexOf(".");			// �����_�̈ʒu

		if (index == -1) {
			return false;						// �����̏ꍇ
		}

		int length = num.length();				// ���������̒���
		int s_length = length - index - 1;		// �����_����̒���

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
	 * �����`�F�b�N�@num ���A�����̏ꍇ�́Atrue ���A�Ԃ��܂��B�����ȊO�̏ꍇ��
	 * false ��Ԃ��܂��Bnum ���A���l�ȊO�̏ꍇ���Afalse ���A�Ԃ��܂��B<br>
	 * 		��FisInteger("0") -> true<br>
	 * 		�@�@isInteger("0.0") -> true<br>
	 * 		�@�@isInteger("0.1") -> false<br>
	 * @param num ����������
	 * @return true:���� false:�����ȊO
	 * @throws NullPointerException num �� null �̏ꍇ
	 */
	public static boolean isInteger(String num) {
		// ���l����
		try{
			BigDecimal buff = new BigDecimal(num);
		}catch(NumberFormatException ex){
			return false;					// ���l�łȂ��ꍇ
		}

		int index = num.indexOf(".");		// �����_�̈ʒu

		if (index == -1){
			 return true;					// �����̏ꍇ
		}
		else{
			int length = num.length();				// ���������̒���
			int s_length = length - index - 1;		// �����_����̒���

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
	 * ��r�@num1 �� num2 �𐔒l�Ƃ��Ĕ�r���܂��B<br>
	 * 		��Fcompare("0.1",".1") -> 0<br>
	 * 		�@�@compare("1","2") -> 1<br>
	 * 		�@�@compare("2","1") -> -1<br>
	 * 		�@�@compare("-1","-2") -> 1<br>
	 * @param num1 ����������
	 * @param num2 ����������
	 * @return  0: num1 == num2
	 *           1: num1 > num2
	 *          -1: num1 < num2
	 * @throws NullPointerException num1 �܂��� num2 �� null �̏ꍇ
	 * @throws NumberFormatException num1 �܂��� num2 �������ȊO�̏ꍇ
	 */
	public static int compare(String num1, String num2) {
		BigDecimal b_num1 = new BigDecimal(num1);
		BigDecimal b_num2 = new BigDecimal(num2);
		return b_num1.compareTo(b_num2);
	}

	/**
	 * �t�H�[�}�b�g�@num �ɁAfigure(�t�H�[�}�b�g����)���@0��t�����܂��B<br>
	 * num �����l�ȊO�̏ꍇ�܂��́Afigure ��0��菬�����ꍇ�́Anum ���A���̂܂ܕԂ��܂��B<br>
	 * 		��FformatNumric("1.23",0) -> "1.23"<br>
	 * 		�@�@formatNumric("1.23",3) -> "1.230"<br>
	 * @param num ����������
	 * @param figure �t�H�[�}�b�g����
	 * @return  �t�H�[�}�b�g��̐���������
	 * @throws NullPointerException num �� null �̏ꍇ
	 */
	public static String formatNumric(String num, int figure) {
		if (figure <= 0) {
			return num;		// �L��������0�ȉ��̏ꍇ�A�I��
		}

		if (isInteger(num) == false && isNumeric(num) == false) {
			return num;		// ���l�łȂ��ꍇ�A�I��
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
	 * �t�H�[�}�b�g�@num ��菬���_�ȉ��̒l���폜�������ʂ�Ԃ��܂��B<br>
	 * num ���A���l�łȂ��ꍇ��A�����_�ȉ��̒l���܂܂Ȃ��ꍇ�́Anum ���A���̂܂ܕԂ��܂��B<br>
	 * 		��FformatInteger("1.23") -> "1"<br>
	 * 		�@�@formatInteger("0.23") -> "0"<br>
	 * 		�@�@formatInteger(".23") -> ""<br>
	 * 		�@�@formatInteger("a1.23") -> "a1"<br>
	 * 		�@�@formatInteger("a1.2.3") -> "a1"<br>
	 * @param num ����������
	 * @return  �t�H�[�}�b�g��̐���������
	 * @throws NullPointerException num �� null �̏ꍇ
	 */
	public static String formatInteger(String num) {
		if (isInteger(num) == true) {
			return num;		// �����łȂ��ꍇ�A�I��
		}

		int index = num.indexOf(".");		// �����_�̈ʒu
		if (index == -1) {
			 return num;					// ���������Ȃ��ꍇ
		}

		String s_upper = num.substring(0, index);		// �������폜
		return s_upper;
	}


	/**
	 * ��������'0'�폜�@num ���A�����_�ȉ��̒l�����ꍇ�A�ŏI�����A������
	 * 0���폜�����l��Ԃ��܂��B�����_�ȉ����S��0�̏ꍇ�́A0���P�c�����l��Ԃ��܂�<br>
	 * num �����l�łȂ��ꍇ�́Anum ���A���̂܂ܕԂ��܂��B<br>
	 *		��Feliminate("1.100") -> "1.1"<br>
	 *		�@�@eliminate("1.000") -> "1.0"<br>
	 * @param num����������
	 * @return '0'�폜��������������
	 * @throws NullPointerException num �� null �̏ꍇ
	 */
	private static String eliminate(String num) {
		// �����_�̈ʒu�擾
		int index = num.indexOf(".");

		if (index == -1) {
			return num;			// ���������Ȃ��ꍇ
		}

		// ������������ꍇ '0'�폜
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
     *   ���l�͈̓`�F�b�N
     *   ���ڂ����l�͈͂����f����
     *
     *   @param    strInString  ���̓p�����[�^
     *   @return ����:true / �G���[:false
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
 
