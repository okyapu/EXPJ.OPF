//------------------------------------------------------------------------------
// (#)AlarmMessage.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/06/09 �V�K�쐬 K.Matsumoto
// 2003/06/25 Copyright�̋L�q�C�� Y.Inada
//            �O�FCopyright (c) 2003 NEC informatec Systems,Ltd.
//            ��FCopyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc�p�R�����g�̑̍ق𐮂���
// 2003/09/24 M.Hotokebuchi
//            ���b�Z�[�W�̃p�����[�^�⊮������� "%0" ���� "{0}" �ɕύX����
//            MessageFormat.format() ���g�p����悤�C��(getMessage()���\�b�h)
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.AlarmMessage;

import java.util.ResourceBundle;
import java.text.MessageFormat;
import java.util.MissingResourceException;

/**
 * �P���b�Z�[�W�̏���ێ�����B<br>
 * ���b�Z�[�W�̓��e�̓��b�Z�[�W��`�t�@�C������擾����B
 *
 * @author  K.Matsumoto
 * @version 1.00
 */
public class AlarmMessage implements java.io.Serializable
{

    /** ���b�Z�[�W�v���p�e�B�t�@�C�� */
    private static ResourceBundle _messages = null;

    /** ���b�Z�[�W�R�[�h */
    private String _code = null;

    /** ���b�Z�[�W�ɖ��ߍ��ޕ����� */
    private String[] _value = null;

    /**
	 * �R���X�g���N�^�B
     */
    public AlarmMessage() {init("", new String[0]);}

    /**
     * �w�肳�ꂽ���b�Z�[�W�R�[�h��ݒ肷��B
     *
     * @param code ���b�Z�[�W�R�[�h
	 */
    public AlarmMessage(String code) {init(code, new String[0]);}

    /**
     * �w�肳�ꂽ���b�Z�[�W�R�[�h�ƃ��b�Z�[�W�ɖ��ߍ��ޕ������ݒ肷��B
     *
     * @param code  ���b�Z�[�W�R�[�h
     * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
    public AlarmMessage(String code, String value) {init(code, str2array(value));}

    /**
     * �w�肳�ꂽ���b�Z�[�W�R�[�h�ƃ��b�Z�[�W�ɖ��ߍ��ޕ������ݒ肷��B
     *
     * @param code  ���b�Z�[�W�R�[�h
     * @param value1 ���b�Z�[�W�ɖ��ߍ��ޕ�����1
     * @param value2 ���b�Z�[�W�ɖ��ߍ��ޕ�����2
	 */
    public AlarmMessage(String code, String value1, String value2) {
        init(code, str2array(value1, value2));
    }

    /**
     * �w�肳�ꂽ���b�Z�[�W�R�[�h�ƃ��b�Z�[�W�ɖ��ߍ��ޕ������ݒ肷��B
     *
     * @param code  ���b�Z�[�W�R�[�h
     * @param value1 ���b�Z�[�W�ɖ��ߍ��ޕ�����1
     * @param value2 ���b�Z�[�W�ɖ��ߍ��ޕ�����2
     * @param value3 ���b�Z�[�W�ɖ��ߍ��ޕ�����3
	 */
    public AlarmMessage(String code, String value1, String value2, String value3) {
        init(code, str2array(value1, value2, value3));
    }

    /**
     * �w�肳�ꂽ���b�Z�[�W�R�[�h�ƃ��b�Z�[�W�ɖ��ߍ��ޕ������ݒ肷��B
     *
     * @param code  ���b�Z�[�W�R�[�h
     * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
    public AlarmMessage(String code, String[] value) {init(code, value);}

    /**
     * ���b�Z�[�W�R�[�h�ƃ��b�Z�[�W�ɖ��ߍ��ޕ������ݒ肷��B
     *
     * @param code  ���b�Z�[�W�R�[�h
     * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
    private void init(String code, String[] value) {
        setCode(code);
        setValue(value);
    }

    /**
     * ���b�Z�[�W�R�[�h�̃A�N�Z�b�T�B
     *
     * @param code ���b�Z�[�W�R�[�h
	 */
    public void setCode(String code) {_code = code;}

    /**
     * ���b�Z�[�W�ɖ��ߍ��ޕ�����̃A�N�Z�b�T�B
     *
     * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
    public void setValue(String value) { setValue(str2array(value)); }

    /**
     * ���b�Z�[�W�ɖ��ߍ��ޕ�����̃A�N�Z�b�T�B
     *
     * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
    public void setValue(String[] value) {_value = value;}

    /**
     * ���b�Z�[�W�R�[�h�̃A�N�Z�b�T�B
     *
     * @return ���b�Z�[�W�R�[�h
	 */
    public String getCode() {return _code.toString();}

    /**
     * ���b�Z�[�W�ɖ��ߍ��ޕ�����̃A�N�Z�b�T
     *
     * @return ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
    public String getValue() {return getValue(0);}

    /**
     * ���b�Z�[�W�ɖ��ߍ��ޕ�����̃A�N�Z�b�T
     *
     * @param idx �z��̃C���f�b�N�X
     * @return ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
    public String getValue(int idx) {
        if (getValues() != null && getValueSize() > idx) {
            if (getValues()[idx] != null) {
                return getValues()[idx].toString();
            }
        }
        return "";
    }

    /**
     * ���b�Z�[�W�ɖ��ߍ��ޕ�����̃A�N�Z�b�T�B
     *
     * @return ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
    public String[] getValues() {return _value;}

    /**
     * ���b�Z�[�W�ɖ��ߍ��ޕ�����̃A�N�Z�b�T�B
     *
     * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
    public void addValue(String value) {
        addValue(str2array(value));
    }

    /**
     * ���b�Z�[�W�ɖ��ߍ��ޕ�����̃A�N�Z�b�T�B
     *
     * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
    public void addValue(String[] value) {
        if (value == null) {
            return;
        }
        if (getValueSize() == 0) {
            setValue(value);
        } else {
            String[] temp = new String[getValueSize() + value.length];
            System.arraycopy(getValues(), 0, temp, 0, getValueSize());
            System.arraycopy(value, 0, temp, getValueSize(), value.length);
            setValue(temp);
        }
    }

    /**
     * ���b�Z�[�W�ɖ��ߍ��ޕ�����̌�����Ԃ��B
     *
     * @return ������̌���
	 */
    public int getValueSize() {
        if (getValues() == null) {
            return 0;
        }
        return getValues().length;
    }

    /**
     * ���b�Z�[�W�t�@�C������A�w�肳�ꂽ���b�Z�[�W�R�[�h�̃��b�Z�[�W���擾���A<br>
     * �擾�������b�Z�[�W�Ɏw�蕶�����}�����ĕԂ��B
     *
     * @return ���b�Z�[�W
	 */
    public String getMessage() {
        /* ���b�Z�[�W�t�@�C������A�w�肳�ꂽ���b�Z�[�W�R�[�h�̃��b�Z�[�W���擾����B */
        String msg = getProperty(getCode());

        /* �t�H�[�}�b�g���ꂽ���b�Z�[�W��Ԃ� */
        return MessageFormat.format(msg, getValues());

    }

    /**
     * ���b�Z�[�W��`�t�@�C������w�肳�ꂽ���b�Z�[�W�R�[�h�̃��b�Z�[�W���擾����B<br>
     * ���b�Z�[�W��`�t�@�C����������Ȃ������ꍇ�ꍇ�́A"���b�Z�[�W��`�t�@�C����������܂���B"<br>
     * �Ƃ����������Ԃ��B<br>
     * �w�肳�ꂽ���b�Z�[�W�L�[�ɑΉ����郁�b�Z�[�W�{����������Ȃ������ꍇ�́A<br>
     * "���b�Z�[�W�L�[" + ���b�Z�[�W�L�[ + "�ɑΉ����郁�b�Z�[�W������܂���B"�Ƃ����������Ԃ��B<br>
     *
     * @param code ���b�Z�[�W�R�[�h
     * @return ���b�Z�[�W
	 */
    static synchronized String getProperty(String code) {
		try {
	        if (_messages == null) {
				_messages = ResourceBundle.getBundle("AlarmMessage");
			}
		}
        catch (MissingResourceException e) {
			return new String("(SBM1203)���b�Z�[�W��`�t�@�C����������܂���B");
        }

        String val = null;
        try {
            val = _messages.getString(code);
        }
        catch (MissingResourceException e) {
            val = new String("(SBM0835)���b�Z�[�W�L�[ " + code + " �ɑΉ����郁�b�Z�[�W������܂���B");
        }
        return val;
    }

    /**
     * �������z��ɕϊ�<br>
     *
     * @param value ������
     * @return �z��
	 */
    private String[] str2array(String value) {
        String[] temp = new String[1];
        temp[0] = value;
        return temp;
    }

    /**
     * �������z��ɕϊ�<br>
     *
     * @param value1 ������
     * @param value2 ������
     * @return �z��
	 */
    private String[] str2array(String value1, String value2) {
        String[] temp = new String[2];
        temp[0] = value1;
        temp[1] = value2;
        return temp;
    }

    /**
     * �������z��ɕϊ�<br>
     *
     * @param value1 ������
     * @param value2 ������
     * @param value3 ������
     * @return �z��
	 */
    private String[] str2array(String value1, String value2, String value3) {
        String[] temp = new String[3];
        temp[0] = value1;
        temp[1] = value2;
        temp[2] = value3;
        return temp;
    }
}