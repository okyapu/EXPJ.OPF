package com.nec.jp.orteus.expj.util;

import java.text.StringCharacterIterator;
import java.text.CharacterIterator;
import java.text.SimpleDateFormat;
import com.nec.jp.orteus.expj.combobox.*;

/**
 * CSV�捞�̋��ʃ`�F�b�N���@
 * ���l�`�F�b�N�A���t�`�F�b�N�A�֑������`�F�b�N�Ȃ�
 *
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.1 $ $Date: 2015/10/23 10:08:30 $
*/
public class CsvInCheck {
	/**
	 *   �����񒷂��`�F�b�N
	 *   
	 *   @param    strInString  ���̓p�����[�^
	 *   @return ����:true / �G���[:false
	 */
    public static int strLengthChk(String strInput) {
    	int intLen = 0;
        try {
             byte[] bytstr = strInput.getBytes("SJIS");
             intLen = bytstr.length;
        } catch( Exception e ) {	
        	 return  0;
        }
        return intLen;
    }
    
    /**
     * �֑������`�F�b�N(�u_�v �u"�v�u\�v)
     * @param str  ������
     * @return     �u_�v: 1
     *             �u"�v: 2
     *             �u\�v: 3
     *            ���̑�: 0
     */
    public static boolean chkHankaku(String str) {
		CharacterIterator iter = new StringCharacterIterator(str);
		for (char c = iter.first(); c != CharacterIterator.DONE; c = iter.next()) {
			// �u%�v 0x0025
			if (c == 0x0025) {
				// �֑�����!
				return true;
			}
			// �u\�v 0x005C
			if (c == 0x005C) {
				// �֑�����!
				return true;
			}
			// �u_�v 0x005F
			if (c == 0x005F) {
				// �֑�����!
				return true;
			}
		}
		return false;
	}
    
    /**
     * ���[���A�h���X�֑̋������`�F�b�N(�u\�v)
     * @param str  ������
     * @return     true or false
     */
    public static boolean chkEmail(String str) {
		CharacterIterator iter = new StringCharacterIterator(str);
		for (char c = iter.first(); c != CharacterIterator.DONE; c = iter.next()) {
			// �u\�v 0x005C
			if (c == 0x005C) {
				// �֑�����!
				return true;
			}
		}
		return false;
	}
    
    /**
     * ���l�A�n�C�t���̃`�F�b�N(�d�b�ԍ�,FAX�ԍ�)
     * @param str  ������
     * @return     true or false
     */
    public static boolean chkTelOrFax(String dataStr) {
		if (!isNull(dataStr)) {
			return dataStr.matches("^([0-9]*[-]*)+$");
		}
		return false;
	}
    
    /**
   	 * �����̃`�F�b�N
   	 * 
   	 * @param dataSource String
   	 * 
   	 * @return true or false boolean true�̏ꍇ�@�����ł��A�@false�̏ꍇ�A�����ł͂Ȃ�
   	 */
    public static boolean checkDate(String dataSource) {
   		String flag = "";
   		if (dataSource.matches("^^\\d{4}\\/\\d{2}\\/\\d{2}$")) {
   			flag = "true";

   		} else if (dataSource.matches("^^\\d{4}\\/\\d{1}\\/\\d{1}$")) {
   			flag = "true";

   		} else if (dataSource.matches("^^\\d{4}\\/\\d{2}\\/\\d{1}$")) {
   			flag = "true";

   		} else if (dataSource.matches("^^\\d{4}\\/\\d{1}\\/\\d{2}$")) {
   			flag = "true";
   		} else {
   			flag = "false";
   		}
   		if ("true".equals(flag)) {
   			try {
   				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
   				dateFormat.setLenient(false);
   				dateFormat.parse(dataSource);
   				return true;
   			} catch (Exception e) {
   				return false;
   			}
   		} else {
   			return false;
   		}
   	}
   	
   	/**
	 * �R���{�{�b�N�X�f�[�^����\���������擾����
	 * 
	 * @param combo
	 *            �R���{�{�b�N�X�f�[�^
	 * @param value
	 *            �R���{�{�b�N�X�f�[�^�̒l
	 * @return �R���{�{�b�N�X�f�[�^�̕\������
	 */
    public static String getDisplayName(ComboStruct combo, String value) {
		for (int j = 0; j < combo.size(); j++) {
			if ((combo.getData(j)[0]).equals(value)) {
				return combo.getData(j)[1];
			}
		}
		return null;
	}
	
	/**
	 * �R���{�{�b�N�X�f�[�^�̑��݃`�F�b�N
	 * 
	 * @param combo
	 *            �R���{�{�b�N�X�f�[�^
	 * @param value
	 *            �R���{�{�b�N�X�f�[�^�̒l
	 * @return �R���{�{�b�N�X�f�[�^���ݏꍇ�ߒltrue,���݂��Ȃ��ꍇ�ߒlfalse
	 */
    public static boolean chkValue(ComboStruct combo, String value) {
		for (int j = 0; j < combo.size(); j++) {
			if (value.equals((combo.getData(j)[0]))) {
				return true;
			}
		}
		return false;
	}
	
	/**
     *   �����`�F�b�N
     *   ���ڂ����������f����
     *
     *   @param  strInString  ���̓p�����[�^
     *   @return ����:true / �G���[:false
     */
    public static boolean isIntegerChk(String strInString) {
        // ������input���Z�b�g�p
    	try {
    	     Integer.parseInt(strInString);
        } catch(Exception e) {
             // �����ł͂Ȃ��ꍇException�ɔ�΂��ď���
             // false���Z�b�g���ď����𔲂���(�G���[�F���l�ȊO�̓���)
             return false;
        }
        // true���Z�b�g���ď����𔲂���(����I��)
        return true;
    }
    
    /**
     *   ���l�`�F�b�N
     *   ���ڂ����l�����f����
     *
     *   @param  strInString  ���̓p�����[�^
     *   @return ����:true / �G���[:false
     */
    public static boolean IsNumChk(String strInString) {
        // ���l��input���Z�b�g�p
		try {
			Double.parseDouble(strInString);
		} catch (Exception e) {
			// ���l�ł͂Ȃ��ꍇException�ɔ�΂��ď���
			// false���Z�b�g���ď����𔲂���(�G���[�F���l�ȊO�̓���)
			return false;
		}
		if (strInString.indexOf('d') != -1 || strInString.indexOf('D') != -1
				|| strInString.indexOf('f') != -1
				|| strInString.indexOf('F') != -1) {
			return false;
		}
		// true���Z�b�g���ď����𔲂���(����I��)
		return true;
    }
    
    /**
     * ���l�͈̓`�F�b�N
     * @param strInString ���l
     * @param integerSize �����ʐ�
     * @param decimalSize �����ʐ�
     * @return ����:true / �G���[:false
     */
    public static boolean isNotInNumRange(String strInString, int integerSize, int decimalSize) {
    	String strInputString = null;
		// �}�C�i�X�̏ꍇ
		if (strInString.indexOf("-") == 0) {
			strInputString = strInString.substring(1);
		} else {
			// �����̏ꍇ
			strInputString = strInString;
		}
		int toneFlg = strInputString.indexOf('.');
		if (toneFlg == -1) {
			// �����̏ꍇ
			if (strInputString.length() > integerSize) {
				return false;
			}
		} else {
			if (decimalSize == 0 && toneFlg == integerSize) {
				return false;
			}
			if (strInputString.length() > decimalSize + integerSize + 1) {
				return false;
			}
			// ����
			String zhstr = strInputString.substring(0, toneFlg);
			// ����
			String xistr = strInputString.substring(toneFlg + 1, strInputString.length());
			if (zhstr.length() > integerSize || xistr.length() > decimalSize) {
				return false;
			}
		}
		return true;
    }
    
    /**
     * �Ώۂ̕�����Null�i�󕶎����邢��Null�j�ł��邩�𔻒肵�܂��B
     * @param str �Ώە�����
     * @return Null�̏ꍇ��true�ANull�ł͂Ȃ��ꍇ��false
     */
    public static boolean isNull(String str) {
		if (str == null || str.length() == 0 || str.equalsIgnoreCase("null")
				|| str == "") {
			return true;
		}
		return false;
	}
	
	/**
	 * ���p�p���̃`�F�b�N
	 * 
	 * @param dataStr String
	 * 
	 * @return true or false boolean 
	 *         true�̏ꍇ ���p�p��
	 *         false�̏ꍇ ���p�p���ł͂Ȃ�
	 */
    public static boolean checkCharater(String dataStr) {
		return dataStr.matches("^[\\x21-\\x7e]+$");
	}
    
    /**
     * ����(\)�ϊ��A�u\�v�Ȃ�A�u\�v�𒼑O�ɒǉ�����
     * @param in  ������
     * @return    �ҏW�㕶����
     */
    public static String replaceSlash(String in) {
        if(in == null)
            return null;
        StringBuffer buffer = new StringBuffer(in.length()*2);
        for(int i=0;i<in.length();i++) {
            char c = in.charAt(i);
            if(c == '\\')
                buffer.append("\\\\");
            else
                buffer.append(c);
        }
        return buffer.toString();
    }
}
