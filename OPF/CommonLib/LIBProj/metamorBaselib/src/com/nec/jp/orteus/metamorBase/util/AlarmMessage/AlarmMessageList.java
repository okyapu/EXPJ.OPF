//------------------------------------------------------------------------------
// (#)AlarmMessageList.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/06/09 �V�K�쐬 K.Matsumoto
// 2003/06/25 Copyright�̋L�q�C�� Y.Inada
//            �O�FCopyright (c) 2003 NEC informatec Systems,Ltd.
//            ��FCopyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc�p�R�����g�̑̍ق𐮂���
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.AlarmMessage;

import java.util.Vector;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.servlet.http.HttpServletRequest;

/**
 * �������b�Z�[�W�̏���ێ�����B<br>
 * ���b�Z�[�W�̓��e�̓��b�Z�[�W��`�t�@�C������擾����B
 *
 * @author  K.Matsumoto
 * @version 1.00
 */
public class AlarmMessageList implements java.io.Serializable {

    /** �^�C�g���R�[�h */
    private String _titleCode = null;

    /** �J�����g���b�Z�[�W */
    private AlarmMessage _aMessage = null;

    /** ���b�Z�[�W���X�g */
    private Vector _messageList = new Vector();

    /** ���b�Z�[�W�C�e���[�^ */
    private Iterator _iterator = null;

    /** ���b�Z�[�W�\���p��JSP */
    private static final String _url = "/AlarmMessage.jsp";

    /**
     * ��̃��b�Z�[�W���X�g���\�z����B
	 */
    public AlarmMessageList() {}

    /**
     * �w�肵�����b�Z�[�W�����b�Z�[�W���X�g�ɒǉ�����B
     *
     * @param message ���b�Z�[�W
	 */
    public AlarmMessageList(AlarmMessage message) { add(message); }

    /**
     * �w�肵�����b�Z�[�W�����b�Z�[�W���X�g�ɒǉ�����B
     *
     * @param messageList ���b�Z�[�W
	 */
    public AlarmMessageList(AlarmMessageList messageList) { add(messageList); }

    /**
     * �w�肵�����b�Z�[�W�R�[�h�ƁA���b�Z�[�W�ɖ��ߍ��ޕ�����łP���b�Z�[�W�������A
     * ���b�Z�[�W���X�g�ɒǉ�����B
     *
     * @param code ���b�Z�[�W�R�[�h
     * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
    public AlarmMessageList(String code, String value) { add(code, value); }

    /**
     * �w�肵�����b�Z�[�W�R�[�h�ƁA���b�Z�[�W�ɖ��ߍ��ޕ�����łP���b�Z�[�W�������A
     * ���b�Z�[�W���X�g�ɒǉ�����B
     *
     * @param code ���b�Z�[�W�R�[�h
     * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
    public AlarmMessageList(String code, String[] value) { add(code, value); }

    /**
     * �^�C�g���R�[�h��ݒ肷��B
     *
     * @param titleCode �^�C�g���R�[�h
	 */
    public AlarmMessageList(String titleCode) { setTitleCode(titleCode); }

    /**
     * �^�C�g���R�[�h��ݒ肷��B<br>
     * �܂��A�w�肵�����b�Z�[�W�R�[�h�ƁA���b�Z�[�W�ɖ��ߍ��ޕ�����łP���b�Z�[�W�������A
     * ���b�Z�[�W���X�g�ɒǉ�����B
     *
     * @param titleCode �^�C�g���R�[�h
     * @param code ���b�Z�[�W�R�[�h
     * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
    public AlarmMessageList(String titleCode, String code, String value) {
        setTitleCode(titleCode);
        add(code, value);
    }

    /**
     * �^�C�g���R�[�h��ݒ肷��B<br>
     * �܂��A�w�肵�����b�Z�[�W�R�[�h�ƁA���b�Z�[�W�ɖ��ߍ��ޕ�����łP���b�Z�[�W�������A
     * ���b�Z�[�W���X�g�ɒǉ�����B
     *
     * @param titleCode �^�C�g���R�[�h
     * @param code ���b�Z�[�W�R�[�h
     * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
    public AlarmMessageList(String titleCode, String code, String[] value) {
        setTitleCode(titleCode);
        add(code, value);
    }

    /**
     * �^�C�g���R�[�h��ݒ肷��B<br>
     * �܂��A�w�肵�����b�Z�[�W�R�[�h�ƁA���b�Z�[�W�ɖ��ߍ��ޕ�����łP���b�Z�[�W�������A
     * ���b�Z�[�W���X�g�ɒǉ�����B
     *
     * @param titleCode �^�C�g���R�[�h
     * @param code ���b�Z�[�W�R�[�h
     * @param value1 ���b�Z�[�W�ɖ��ߍ��ޕ�����1
     * @param value2 ���b�Z�[�W�ɖ��ߍ��ޕ�����2
	 */
    public AlarmMessageList(String titleCode, String code, String value1, String value2) {
        setTitleCode(titleCode);
        add(code, value1, value2);
    }

    /**
     * �^�C�g���R�[�h��ݒ肷��B<br>
     * �܂��A�w�肵�����b�Z�[�W�R�[�h�ƁA���b�Z�[�W�ɖ��ߍ��ޕ�����łP���b�Z�[�W�������A
     * ���b�Z�[�W���X�g�ɒǉ�����B
     *
     * @param titleCode �^�C�g���R�[�h
     * @param code ���b�Z�[�W�R�[�h
     * @param value1 ���b�Z�[�W�ɖ��ߍ��ޕ�����1
     * @param value2 ���b�Z�[�W�ɖ��ߍ��ޕ�����2
     * @param value3 ���b�Z�[�W�ɖ��ߍ��ޕ�����3
	 */
    public AlarmMessageList(String titleCode, String code, String value1, String value2, String value3) {
        setTitleCode(titleCode);
        add(code, value1, value2, value3);
    }

    /**
     * �^�C�g���R�[�h��ݒ肵�A�w�肵�����b�Z�[�W�����b�Z�[�W���X�g�ɒǉ�����B<br>
     *
     * @param titleCode �^�C�g���R�[�h
     * @param message ���b�Z�[�W
	 */
    public AlarmMessageList(String titleCode, AlarmMessage message) {
        setTitleCode(titleCode);
        add(message);
    }

    /**
     * �^�C�g���R�[�h��ݒ肵�A�w�肵�����b�Z�[�W�����b�Z�[�W���X�g�ɒǉ�����B<br>
     *
     * @param titleCode �^�C�g���R�[�h
     * @param messageList ���b�Z�[�W���X�g
	 */
    public AlarmMessageList(String titleCode, AlarmMessageList messageList) {
        setTitleCode(titleCode);
        add(messageList);
    }

    /**
     * �^�C�g���R�[�h�̃A�N�Z�b�T�B
     *
     * @param titleCode �^�C�g���R�[�h
	 */
    public void setTitleCode(String titleCode) { _titleCode = titleCode; }

    /**
     * �^�C�g���R�[�h�̃A�N�Z�b�T�B
     *
     * @return �^�C�g���R�[�h
	 */
    public String getTitleCode() { return _titleCode; }

    /**
     * ���b�Z�[�W�t�@�C�����A�w�肳�ꂽ�^�C�g���R�[�h�̃^�C�g�����擾����B
     *
     * @return �^�C�g��
	 */
    public String getTitle() {
        if (getTitleCode() == null) return null;
        return AlarmMessage.getProperty(getTitleCode());
    }

    /**
     * �w�肵�����b�Z�[�W�R�[�h�łP���b�Z�[�W�������A���b�Z�[�W���X�g�ɒǉ�����B
     *
     * @param code ���b�Z�[�W�R�[�h
	 */
    public void add(String code) {add(code, "");}

    /**
     * �w�肵�����b�Z�[�W�R�[�h�ƁA���b�Z�[�W�ɖ��ߍ��ޕ�����łP���b�Z�[�W�������A
     * ���b�Z�[�W���X�g�ɒǉ�����B
     *
     * @param code ���b�Z�[�W�R�[�h
     * @param value ���b�Z�[�W�ɖ��ߍ��ޒl
	 */
    public void add(String code, String value) {
        AlarmMessage work = new AlarmMessage(code, value);
        _messageList.addElement(work);
    }

    /**
     * �w�肵�����b�Z�[�W�R�[�h�ƁA���b�Z�[�W�ɖ��ߍ��ޕ�����łP���b�Z�[�W�������A
     * ���b�Z�[�W���X�g�ɒǉ�����B
     *
     * @param code ���b�Z�[�W�R�[�h
     * @param value1 ���b�Z�[�W�ɖ��ߍ��ޒl1
     * @param value2 ���b�Z�[�W�ɖ��ߍ��ޒl2
	 */
    public void add(String code, String value1, String value2) {
        AlarmMessage work = new AlarmMessage(code, value1, value2);
        _messageList.addElement(work);
    }

    /**
     * �w�肵�����b�Z�[�W�R�[�h�ƁA���b�Z�[�W�ɖ��ߍ��ޕ�����łP���b�Z�[�W�������A
     * ���b�Z�[�W���X�g�ɒǉ�����B
     *
     * @param code ���b�Z�[�W�R�[�h
     * @param value1 ���b�Z�[�W�ɖ��ߍ��ޒl1
     * @param value2 ���b�Z�[�W�ɖ��ߍ��ޒl2
     * @param value3 ���b�Z�[�W�ɖ��ߍ��ޒl3
	 */
    public void add(String code, String value1, String value2, String value3) {
        AlarmMessage work = new AlarmMessage(code, value1, value2, value3);
        _messageList.addElement(work);
    }

    /**
     * �w�肵�����b�Z�[�W�R�[�h�ƁA���b�Z�[�W�ɖ��ߍ��ޕ�����łP���b�Z�[�W�������A
     * ���b�Z�[�W���X�g�ɒǉ�����B
     *
     * @param code ���b�Z�[�W�R�[�h
     * @param value ���b�Z�[�W�ɖ��ߍ��ޒl
	 */
    public void add(String code, String[] value) {
        AlarmMessage work = new AlarmMessage(code, value);
        _messageList.addElement(work);
    }

    /**
     * �w�肵�����b�Z�[�W���X�g�����b�Z�[�W���X�g�ɒǉ�����B
     *
     * @param messageList ���b�Z�[�W���X�g
	 */
    public void add(AlarmMessageList messageList) {
        while (messageList.next()) {
            add(messageList.getCode(), messageList.getValues());
        }
    }

    /**
     * �w�肵�����b�Z�[�W�����b�Z�[�W���X�g�ɒǉ�����B
     *
     * @param message ���b�Z�[�W
	 */
    public void add(AlarmMessage message) {
        _messageList.addElement(message);
    }

    /**
     * ���N�G�X�g�Ƀ��b�Z�[�W���Z�b�g����B
     *
     * @param request ���N�G�X�g
	 */
    public void setToRequest(HttpServletRequest request) {
        request.setAttribute("msg", this);
    }

    /**
     * ���b�Z�[�W���X�g�̃C�e���[�^���擾�B
     *
     * @return �C�e���[�^
	 */
    private Iterator getIterator() {
        if (_iterator == null) {
            _iterator = _messageList.iterator();
        }
        return _iterator;
    }

    /**
     * ���b�Z�[�W�̃J�����g������������B
	 */
    public void resetCurrent() {
        _iterator = _messageList.iterator();
    }

    /**
     * ���b�Z�[�W���X�g�̃J�����g����i�߁A�����b�Z�[�W�̗L����Ԃ��B
     *
     * @return �����b�Z�[�W�̗L�� true:�L  false:��
	 */
    public boolean next() {
        boolean ret = getIterator().hasNext();
        if (ret == true) {
            _aMessage = (AlarmMessage) getIterator().next();
        }
        return ret;
    }

    /**
     * ���b�Z�[�W���N���A�B
	 */
    public void clear() {
        _messageList.clear();
        _iterator = null;
        _aMessage = null;
        _titleCode = null;
    }

    /**
     * ���b�Z�[�W�̗L���B
     *
     * @return ���b�Z�[�W�̗L�� true:��  false:�L
	 */
    public boolean isEmpty() {
        return _messageList.isEmpty();
    }

    /**
     * �J�����g���b�Z�[�W�ɑ΂��郁�b�Z�[�W�R�[�h�A�N�Z�b�T�B
     *
     * @return ���b�Z�[�W�R�[�h
	 */
    public String getCode() {
        if (_aMessage == null) {
            throw new NoSuchElementException();
        }
        return _aMessage.getCode();
    }

    /**
     * �J�����g���b�Z�[�W�ɑ΂��郁�b�Z�[�W�ɖ��ߍ��ޕ�����̃A�N�Z�b�T�B
     *
     * @return ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
    public String getValue() {
        if (_aMessage == null) {
            throw new NoSuchElementException();
        }
        return _aMessage.getValue();
    }

    /**
     * �J�����g���b�Z�[�W�ɑ΂��郁�b�Z�[�W�ɖ��ߍ��ޕ�����̃A�N�Z�b�T�B
     *
     * @param idx �z��̃C���f�b�N�X
     * @return ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
    public String getValue(int idx) {
        if (_aMessage == null) {
            throw new NoSuchElementException();
        }
        return _aMessage.getValue(idx);
    }

    /**
     * �J�����g���b�Z�[�W�ɑ΂��郁�b�Z�[�W�ɖ��ߍ��ޕ�����̃A�N�Z�b�T�B
     *
     * @return ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
    public String[] getValues() {
        if (_aMessage == null) {
            throw new NoSuchElementException();
        }
        return _aMessage.getValues();
    }

    /**
     * ���b�Z�[�W�t�@�C������J�����g���b�Z�[�W�R�[�h�̃��b�Z�[�W���擾����B
     *
     * @return ���b�Z�[�W
	 */
    public String getMessage() {
        if (_aMessage == null) {
            throw new NoSuchElementException();
        }
        return _aMessage.getMessage();
    }

    /**
     * ���b�Z�[�W�\���pJSP��URL���擾����B
     *
     * @return URL
	 */
    public String getJspUrl() {
		return _url;
    }
}
