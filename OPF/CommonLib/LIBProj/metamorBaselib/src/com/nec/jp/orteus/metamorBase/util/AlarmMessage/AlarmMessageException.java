//------------------------------------------------------------------------------
// (#)AlarmMessageException.java
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

import javax.servlet.http.HttpServletRequest;

/**
 * ���b�Z�[�W���O�Ƃ��Ď�舵���B<br>
 * ���b�Z�[�W�̓��e�̓��b�Z�[�W��`�t�@�C������擾����B
 *
 * @author  K.Matsumoto
 * @version 1.00
 */
public class AlarmMessageException extends RuntimeException
{

    /** ���b�Z�[�W���X�g */
    private AlarmMessageList _messages = null;

    /**
     * ���b�Z�[�W���X�g�𐶐�����B
	 */
    public AlarmMessageException() {
        super();
        _messages = new AlarmMessageList();
    }

    /**
     * ���b�Z�[�W���X�g�𐶐����A
     * �w�肵�����b�Z�[�W�R�[�h�A���b�Z�[�W�ɖ��ߍ��ޕ�����łP���b�Z�[�W�������A�ǉ�����B
     *
     * @param code ���b�Z�[�W�R�[�h
     * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
    public AlarmMessageException(String code, String value) {
        this();
        _messages.add(code, value);
    }

    /**
     * ���b�Z�[�W���X�g�𐶐����A
     * �w�肵�����b�Z�[�W�R�[�h�A���b�Z�[�W�ɖ��ߍ��ޕ�����łP���b�Z�[�W�������A�ǉ�����B
     *
     * @param code ���b�Z�[�W�R�[�h
     * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
    public AlarmMessageException(String code, String[] value) {
        this();
        _messages.add(code, value);
    }

    /**
     * ���b�Z�[�W���X�g�𐶐����A�w�肵�����b�Z�[�W��ǉ�����B
     *
     * @param message ���b�Z�[�W
	 */
    public AlarmMessageException(AlarmMessage message) {
        this();
        _messages.add(message);
    }

    /**
     * ���b�Z�[�W���X�g�𐶐����A�w�肵�����b�Z�[�W��ǉ�����B
     *
     * @param messages ���b�Z�[�W
	 */
    public AlarmMessageException(AlarmMessageList messages) {
        this();
        _messages.add(messages);
        _messages.setTitleCode(messages.getTitleCode());
    }

    /**
     * ���b�Z�[�W���X�g�𐶐����A�^�C�g���R�[�h��ݒ肷��B
     *
     * @param titleCode �^�C�g���R�[�h
	 */
    public AlarmMessageException(String titleCode) {
        this();
        _messages.setTitleCode(titleCode);
    }

    /**
     * ���b�Z�[�W���X�g�𐶐����A�^�C�g���R�[�h��ݒ肷��B
     * �܂��A�w�肵�����b�Z�[�W�R�[�h�A���b�Z�[�W�ɖ��ߍ��ޕ�����łP���b�Z�[�W�������A�ǉ�����B
     *
     * @param titleCode �^�C�g���R�[�h
     * @param code �^�C�g���R�[�h
     * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
    public AlarmMessageException(String titleCode, String code, String value) {
        this();
        _messages.setTitleCode(titleCode);
        _messages.add(code, value);
    }

    /**
     * ���b�Z�[�W���X�g�𐶐����A�^�C�g���R�[�h��ݒ肷��B
     * �܂��A�w�肵�����b�Z�[�W�R�[�h�A���b�Z�[�W�ɖ��ߍ��ޕ�����łP���b�Z�[�W�������A�ǉ�����B
     *
     * @param titleCode �^�C�g���R�[�h
     * @param code �^�C�g���R�[�h
     * @param value1 ���b�Z�[�W�ɖ��ߍ��ޕ�����1
     * @param value2 ���b�Z�[�W�ɖ��ߍ��ޕ�����2
	 */
    public AlarmMessageException(String titleCode, String code, String value1, String value2) {
        this();
        _messages.setTitleCode(titleCode);
        _messages.add(code, value1, value2);
    }

    /**
     * ���b�Z�[�W���X�g�𐶐����A�^�C�g���R�[�h��ݒ肷��B
     * �܂��A�w�肵�����b�Z�[�W�R�[�h�A���b�Z�[�W�ɖ��ߍ��ޕ�����łP���b�Z�[�W�������A�ǉ�����B
     *
     * @param titleCode �^�C�g���R�[�h
     * @param code �^�C�g���R�[�h
     * @param value1 ���b�Z�[�W�ɖ��ߍ��ޕ�����1
     * @param value2 ���b�Z�[�W�ɖ��ߍ��ޕ�����2
     * @param value3 ���b�Z�[�W�ɖ��ߍ��ޕ�����3
	 */
    public AlarmMessageException(String titleCode, String code, String value1, String value2, String value3) {
        this();
        _messages.setTitleCode(titleCode);
        _messages.add(code, value1, value2, value3);
    }

    /**
     * ���b�Z�[�W���X�g�𐶐����A�^�C�g���R�[�h��ݒ肷��B
     * �܂��A�w�肵�����b�Z�[�W�R�[�h�A���b�Z�[�W�ɖ��ߍ��ޕ�����łP���b�Z�[�W�������A�ǉ�����B
     *
     * @param titleCode �^�C�g���R�[�h
     * @param code �^�C�g���R�[�h
     * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
    public AlarmMessageException(String titleCode, String code, String[] value) {
        this();
        _messages.setTitleCode(titleCode);
        _messages.add(code, value);
    }

    /**

     * ���b�Z�[�W���X�g�𐶐����A
     * �^�C�g���R�[�h��ݒ肵�āA�w�肳�ꂽ���b�Z�[�W��ǉ�����B
     *
     * @param titleCode �^�C�g���R�[�h
     * @param message ���b�Z�[�W
	 */
    public AlarmMessageException(String titleCode, AlarmMessage message) {
        this();
        _messages.setTitleCode(titleCode);
        _messages.add(message);
    }

    /**
     * ���b�Z�[�W���X�g�𐶐����A
     * �^�C�g���R�[�h��ݒ肵�āA�w�肳�ꂽ���b�Z�[�W��ǉ�����B
     *
     * @param titleCode �^�C�g���R�[�h
     * @param messages ���b�Z�[�W
	 */
    public AlarmMessageException(String titleCode, AlarmMessageList messages) {
        this();
        _messages.setTitleCode(titleCode);
        _messages.add(messages);
    }

    /**
     * ���b�Z�[�W�N���X��Ԃ��B
     *
     * @return ���b�Z�[�W
	 */
    public AlarmMessageList getMessages() {
        return _messages;
    }

    /**
     * �^�C�g���R�[�h�̃A�N�Z�b�T�B
     *
     * @param titleCode �^�C�g���R�[�h
	 */
    public void setTitleCode(String titleCode) { _messages.setTitleCode(titleCode); }

    /**
     * �^�C�g���R�[�h�̃A�N�Z�b�T�B
     *
     * @return �^�C�g���R�[�h
	 */
    public String getTitleCode() { return _messages.getTitleCode(); }

    /**
     * ���b�Z�[�W�t�@�C�����A�w�肳�ꂽ�^�C�g���R�[�h�̃^�C�g�����擾����B
     *
     * @return �^�C�g��
	 */
    public String getTitle() { return _messages.getTitle(); }

    /**
     * �w�肵�����b�Z�[�W�R�[�h�łP���b�Z�[�W�������A���b�Z�[�W���X�g�ɒǉ�����B
     *
     * @param code ���b�Z�[�W�R�[�h
	 */
    public void add(String code) {_messages.add(code);}

    /**
     * �w�肵�����b�Z�[�W�R�[�h�ƁA���b�Z�[�W�ɖ��ߍ��ޕ�����łP���b�Z�[�W�������A
     * ���b�Z�[�W���X�g�ɒǉ�����B
     *
     * @param code ���b�Z�[�W�R�[�h
     * @param value ���b�Z�[�W�ɖ��ߍ��ޒl
	 */
    public void add(String code, String value) {
        _messages.add(code, value);
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
        _messages.add(code, value1, value2);
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
        _messages.add(code, value1, value2, value3);
    }

    /**
     * �w�肵�����b�Z�[�W�R�[�h�ƁA���b�Z�[�W�ɖ��ߍ��ޕ�����łP���b�Z�[�W�������A
     * ���b�Z�[�W���X�g�ɒǉ�����B
     *
     * @param code ���b�Z�[�W�R�[�h
     * @param value ���b�Z�[�W�ɖ��ߍ��ޒl
	 */
    public void add(String code, String[] value) {
        _messages.add(code, value);
    }

    /**
     * �w�肵�����b�Z�[�W���X�g�����b�Z�[�W���X�g�ɒǉ�����B
     *
     * @param messages ���b�Z�[�W���X�g
	 */
    public void add(AlarmMessageList messages) {
        _messages.add(messages);
    }

    /**
     * �w�肵�����b�Z�[�W�����b�Z�[�W���X�g�ɒǉ�����B
     *
     * @param message ���b�Z�[�W
	 */
    public void add(AlarmMessage message) {
        _messages.add(message);
    }

    /**
     * ���N�G�X�g�Ƀ��b�Z�[�W���Z�b�g����B
     *
     * @param request ���N�G�X�g
	 */
    public void setToRequest(HttpServletRequest request) {
        _messages.setToRequest(request);
    }

    /**
     * ���b�Z�[�W�̃J�����g������������B
	 */
    public void resetCurrent() {
        _messages.resetCurrent();
    }

    /**
     * ���b�Z�[�W���X�g�̃J�����g����i�߁A�����b�Z�[�W�̗L����Ԃ��B
     *
     * @return �����b�Z�[�W�̗L�� true:�L  false:��
	 */
    public boolean next() {
        return _messages.next();
    }

    /**
     * ���b�Z�[�W���N���A�B
	 */
    public void clear() {
        _messages.clear();
    }

    /**
     * ���b�Z�[�W�̗L���B
     *
     * @return ���b�Z�[�W�̗L�� true:��  false:�L
	 */
    public boolean isEmpty() {
        return _messages.isEmpty();
    }

    /**
     * �J�����g���b�Z�[�W�ɑ΂��郁�b�Z�[�W�R�[�h�A�N�Z�b�T�B
     *
     * @return ���b�Z�[�W�R�[�h
	 */
    public String getCode() {
        return _messages.getCode();
    }

    /**
     * �J�����g���b�Z�[�W�ɑ΂��郁�b�Z�[�W�ɖ��ߍ��ޕ�����̃A�N�Z�b�T�B
     *
     * @return ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
    public String getValue() {
        return _messages.getValue();
    }

    /**
     * �J�����g���b�Z�[�W�ɑ΂��郁�b�Z�[�W�ɖ��ߍ��ޕ�����̃A�N�Z�b�T�B
     *
     * @param idx �z��̃C���f�b�N�X
     * @return ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
    public String getValue(int idx) {
        return _messages.getValue(idx);
    }

    /**
     * �J�����g���b�Z�[�W�ɑ΂��郁�b�Z�[�W�ɖ��ߍ��ޕ�����̃A�N�Z�b�T�B
     *
     * @return ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
    public String[] getValues() {
        return _messages.getValues();
    }

    /**
     * ���b�Z�[�W�t�@�C������J�����g���b�Z�[�W�R�[�h�̃��b�Z�[�W���擾����B
     *
     * @return ���b�Z�[�W
	 */
    public String getMessage() {
        try {
            return _messages.getMessage();
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * ���b�Z�[�W�\���pJSP��URL���擾����B
     *
     * @return URL
	 */
    public String getJspUrl() {
		return _messages.getJspUrl();
    }
}
