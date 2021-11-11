//------------------------------------------------------------------------------
// (#)IntegerConverter.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/11/14 �V�K�쐬 M.Shirai
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.util;

/**
 * Integer�ϊ��N���X�B
 *
 * @author  M.shirai
 * @version 1.00
*/
public class IntegerConverter
{
	
	public IntegerConverter(){}
	
	/**
	 * ������ϊ�
	 * @param str ����������
	 * @return String�^��Integer�ɕϊ������l �G���[����null��ԋp
	 */
	public static Integer Convert(String str)
	{
		try {
			// ������̐擪��"+"���r����
			if(str.charAt(0) == '+') {
				// �擪��"+"�Ȃ�2�����ڈȍ~����Integer�ɕϊ�
				return Integer.valueOf(str.substring(1));
			} else {
				return Integer.valueOf(str);
			}
		} catch (Exception e){
			return null;
		}
	}

}