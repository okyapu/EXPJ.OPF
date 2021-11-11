/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/MessageStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

import java.util.List;
import java.util.ArrayList;
import com.nec.jp.orteus.util.CoreTools;

/**
 * ���b�Z�[�W�B
 * ���b�Z�[�W���e��ێ��N���X�B
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:13 $
 */
public class MessageStruct {

	/**
	 * �G���[�̃^�C�v
	 */
	public final static int ERROR = 0;

	/**
	 * �x���̃^�C�v
	 */
	public final static int WARN = ERROR + 1;

	/**
	 * ���̃^�C�v
	 */
	public final static int INFO = WARN + 1;

	/**
	 * ���b�Z�[�W�^�C�v���X�g
	 */
	private List _typeList = new ArrayList(0);

	/**
	 * ���b�Z�[�W�R�[�h���X�g
	 */
	private List _codeList = new ArrayList(0);

	/**
	 * ���b�Z�[�W���X�g
	 */
	private List _messageList = new ArrayList(0);

	/**
	 * �G���[���X�g
	 */
	private List _errorList = new ArrayList(0);

	/**
	 * �x�����X�g
	 */
	private List _warnList = new ArrayList(0);

	/**
	 * ��񃊃X�g
	 */
	private List _infoList = new ArrayList(0);

	/**
	 * ���P�[��
	 */
	private String _locale = null;

	/**
	  * �R���X�g���N�^�i�f�t�H���g���P�[���j
	 */
	public MessageStruct() {
		this(null, false);
	}

	/**
	  * �R���X�g���N�^�i���P�[���w��j
	 * @param locale �擾���郁�b�Z�[�W�̃��P�[��
	 */
	public MessageStruct(String locale) {
		this(locale, true);
	}

	/**
	  * �R���X�g���N�^�i���P�[���E���[�U�w��j
	 * @param code �擾���郁�b�Z�[�W�̃��P�[�� or ���[�UCD
	 * @param localeFlg true:���P�[���w��Cfalse:���[�U�w��
	 */
	public MessageStruct(String code, boolean localeFlg) {
		if (localeFlg) {
			_locale = code;
		} else {
			_locale = CoreTools.getLocale(code);
		}
	}

	/**
	 * ���P�[���Z�b�g
	 * @param locale �擾���郁�b�Z�[�W�̃��P�[��
	 */
	public void setLocale(String locale) {
		_locale = locale;
	}

	/**
	 * ���P�[���擾
	 * @return locale �擾���郁�b�Z�[�W�̃��P�[��
	 */
	public String getLocale() {
		return _locale;
	}

	/**
	 * ���b�Z�[�W�R�[�h���X�g�擾
	 * @return ���b�Z�[�W�R�[�h���X�g
	 */
	public List getCode(){
		return _codeList;
	}

	/**
	 * ���b�Z�[�W�^�C�v���X�g�擾
	 * @return ���b�Z�[�W�^�C�v���X�g
	 */
	public List getType(){
		return _typeList;
	}

	/**
	 * ���b�Z�[�W���X�g�擾
	 * @return ���b�Z�[�W���X�g
	 */
	public List getMessage(){
		if(getSize() < sizeError() + sizeWarn() + sizeInfo()) {
			RemakeMessage();
		}
		return _messageList;
	}

	/**
	 * �G���[���X�g�擾
	 * @return �G���[���X�g
	 */
	public List getError()
	{
		return _errorList;
	}

	/**
	 * �x�����X�g�擾
	 * @return �x�����X�g
	 */
	public List getWarn()
	{
		return _warnList;
	}

	/**
	 * ��񃊃X�g�擾
	 * @return ��񃊃X�g
	 */
	public List getInfo()
	{
		return _infoList;
	}

	/**
	 * �w�肳�ꂽ�ʒu�ɂ��郁�b�Z�[�W�R�[�h��Ԃ��܂�
	 * @param index �擾����ʒu
	 * @return ���b�Z�[�W�R�[�h
	 */
	public String getCode(int index){
		return _codeList.get(index).toString();
	}

	/**
	 * �w�肳�ꂽ�ʒu�ɂ��郁�b�Z�[�W�^�C�v��Ԃ��܂�
	 * @param index �擾����ʒu
	 * @return ���b�Z�[�W�^�C�v
	 */
	public int getType(int index){
		return Integer.parseInt(_typeList.get(index).toString());
	}

	/**
	 * �w�肳�ꂽ�ʒu�ɂ��郁�b�Z�[�W��Ԃ��܂�
	 * @param index �擾����ʒu
	 * @return ���b�Z�[�W
	 */
	public String getMessage(int index){
		return _messageList.get(index).toString();
	}


	/**
	 * ���b�Z�[�W�^�C�v���X�g�ݒ�
	 * @param list ���b�Z�[�W�^�C�v���X�g
	 */
	public void setType(List list){
		_typeList = list;
	}

	/**
	 * ���b�Z�[�W�R�[�h���X�g�ݒ�
	 * @param list ���b�Z�[�W�R�[�h���X�g
	 */
	public void setCode(List list){
		_codeList = list;
	}

	/**
	 * ���b�Z�[�W���X�g�ݒ�
	 * @param list ���b�Z�[�W���X�g
	 */
	public void setMessage(List list){
		_messageList = list;
	}

	/**
	 * �G���[���X�g�ݒ�
	 * @param list �G���[���X�g
	 */
	public void setError(List list)
	{
		_errorList = list;
	}

	/**
	 * �x�����X�g�ݒ�
	 * @param list �x�����X�g
	 */
	public void setWarn(List list)
	{
		_warnList = list;
	}

	/**
	 * ��񃊃X�g�ݒ�
	 * @param list ��񃊃X�g
	 */
	public void setInfo(List list)
	{
		_infoList = list;
	}


	/**
	 * ���b�Z�[�W�ǉ�
	 * @param type ���b�Z�[�W�̃^�C�v�i�G���[�A�x���A���j
	 * @param msg ���b�Z�[�W
	 */
	public void addMessage(int type, ExpjMessage msg)
	{
		addMessage(type, msg.getCode(), msg.getMessage(_locale));
	}

	/**
	 * �G���[���b�Z�[�W�ǉ�
	 * @param msg �G���[���b�Z�[�W
	 */
	public void addError(ExpjMessage msg)
	{
		addError(msg.getCode(), msg.getMessage(_locale));
	}

	/**
	 * �x�����b�Z�[�W�ǉ�
	 * @param msg �x�����b�Z�[�W
	 */
	public void addWarn(ExpjMessage msg)
	{
		addWarn(msg.getCode(), msg.getMessage(_locale));
	}

	/**
	 * ��񃁃b�Z�[�W�ǉ�
	 * @param msg ��񃁃b�Z�[�W
	 */
	public void addInfo(ExpjMessage msg)
	{
		addInfo(msg.getCode(), msg.getMessage(_locale));
	}

	/**
	 * ���b�Z�[�W�ǉ�
	 * @param type ���b�Z�[�W�̃^�C�v�i�G���[�A�x���A���j
	 * @param message ���b�Z�[�W
	 */
	public void addMessage(int type ,String message){
		addMessage(type ,"" , message);
	}

	/**
	 * �G���[���b�Z�[�W�ǉ�
	 * @param message �G���[���b�Z�[�W
	 */
	public void addError(String message)
	{
		addError("" , message);
	}

	/**
	 * �x�����b�Z�[�W�ǉ�
	 * @param message �x�����b�Z�[�W
	 */
	public void addWarn(String message)
	{
		addWarn("" , message);
	}

	/**
	 * ��񃁃b�Z�[�W�ǉ�
	 * @param message ��񃁃b�Z�[�W
	 */
	public void addInfo(String message)
	{
		addInfo("" , message);
	}


	/**
	 * ���b�Z�[�W�ǉ�
	 * @param type ���b�Z�[�W�̃^�C�v�i�G���[�A�x���A���j
	 * @param code ���b�Z�[�W�R�[�h
	 * @param message ���b�Z�[�W
	 */
	public void addMessage(int type ,String code ,String message){
		if (type != this.ERROR && type != this.WARN && type != this.INFO) {
			return;
		}
		if (code == null || message == null) {
			return;
		}
		if (type == ERROR) {
			addError(code, message);
		}
		if (type == WARN) {
			addWarn(code, message);
		}
		if (type == INFO) {
			addInfo(code, message);
		}
	}

	/**
	 * �G���[���b�Z�[�W�ǉ�
	 * @param code ���b�Z�[�WCD
	 * @param message �G���[���b�Z�[�W
	 */
	public void addError(String code , String message)
	{
		if (code == null || message == null) {
			return;
		}
		String msg = null;
		if (code == "") {
			msg = message;
		} else {
			msg = new String("[" + code + "] " + message);
		}
		_typeList.add("" + ERROR);
		_codeList.add(code);
		_messageList.add(msg);
		_errorList.add(msg);
	}

	/**
	 * �x�����b�Z�[�W�ǉ�
	 * @param code ���b�Z�[�WCD
	 * @param message �x�����b�Z�[�W
	 */
	public void addWarn(String code , String message)
	{
		if (code == null || message == null) {
			return;
		}
		String msg = null;
		if (code == "") {
			msg = message;
		} else {
			msg = new String("[" + code + "] " + message);
		}
		_typeList.add("" + WARN);
		_codeList.add(code);
		_messageList.add(msg);
		_warnList.add(msg);
	}

	/**
	 * ��񃁃b�Z�[�W�ǉ�
	 * @param code ���b�Z�[�WCD
	 * @param message ��񃁃b�Z�[�W
	 */
	public void addInfo(String code , String message)
	{
		if (code == null || message == null) {
			return;
		}
		String msg = null;
		if (code == "") {
			msg = message;
		} else {
			msg = new String("[" + code + "] " + message);
		}
		_typeList.add("" + INFO);
		_codeList.add(code);
		_messageList.add(msg);
		_infoList.add(msg);
	}


	/**
	 * �S���b�Z�[�W�N���A
	 */
	public void clearAll()
	{
		_errorList.clear();
		_warnList.clear();
		_infoList.clear();
		clear();
	}

	/**
	 * ���b�Z�[�W�N���A
	 */
	public void clear(){
		clearType();
		clearCode();
		clearMessage();
	}

	/**
	 * �G���[���b�Z�[�W�N���A
	 */
	public void clearError()
	{
		_errorList.clear();
		RemakeMessage();
	}

	/**
	 * �x�����b�Z�[�W�N���A
	 */
	public void clearWarn()
	{
		_warnList.clear();
		RemakeMessage();
	}

	/**
	 * ��񃁃b�Z�[�W�N���A
	 */
	public void clearInfo()
	{
		_infoList.clear();
		RemakeMessage();
	}

	/**
	 * ���b�Z�[�W�^�C�v���X�g�̃N���A
	 */
	private void clearType(){
		_typeList.clear();
	}

	/**
	 * ���b�Z�[�W�R�[�h���X�g�̃N���A
	 */
	private void clearCode(){
		_codeList.clear();
	}

	/**
	 * ���b�Z�[�W���X�g�̃N���A
	 */
	private void clearMessage(){
		_messageList.clear();
	}


	/**
	 * ���b�Z�[�W���X�g�T�C�Y�擾
	 * @return ���b�Z�[�W��
	 */
	public int getSize(){
		int total = sizeError() + sizeWarn() + sizeInfo();
		if(_messageList.size() < total) {
			RemakeMessage();
		}
		return _messageList.size();
	}


	/**
	 * �G���[���X�g�T�C�Y�擾
	 * @return �G���[���b�Z�[�W��
	 */
	public int sizeError()
	{
		return _errorList.size();
	}

	/**
	 * �x�����X�g�T�C�Y�擾
	 * @return �x�����b�Z�[�W��
	 */
	public int sizeWarn()
	{
		return _warnList.size();
	}

	/**
	 * ��񃊃X�g�T�C�Y�擾
	 * @return ��񃁃b�Z�[�W��
	 */
	public int sizeInfo()
	{
		return _infoList.size();
	}

	/**
	 * ���b�Z�[�W�L������
	 * @return ���b�Z�[�W�L����
	 */
	public boolean hasMessage()
	{
		int total = sizeError() + sizeWarn() + sizeInfo();
		if(_messageList.size() < total) {
			RemakeMessage();
		}
		return !_messageList.isEmpty();
	}

	/**
	 * �G���[���b�Z�[�W�L������
	 * @return �G���[���b�Z�[�W�L��
	 */
	public boolean hasError()
	{
		return !_errorList.isEmpty();
	}

	/**
	 * �x�����b�Z�[�W�L������
	 * @return �x�����b�Z�[�W�L��
	 */
	public boolean hasWarn()
	{
		return !_warnList.isEmpty();
	}

	/**
	 * ��񃁃b�Z�[�W�L������
	 * @return ��񃁃b�Z�[�W�L��
	 */
	public boolean hasInfo()
	{
		return !_infoList.isEmpty();
	}

	/**
	 * ���b�Z�[�W�č\��
	 */
	public void RemakeMessage()
	{
		_typeList = new ArrayList(0);
		_codeList = new ArrayList(0);
		_messageList = new ArrayList(0);
		for(int i = 0; i < sizeError(); i++)
		{
			_typeList.add("0");
			_codeList.add("");
			_messageList.add(_errorList.get(i).toString());
		}

		for(int i = 0; i < sizeWarn(); i++)
		{
			_typeList.add("1");
			_codeList.add("");
			_messageList.add(_warnList.get(i).toString());
		}

		for(int i = 0; i < sizeInfo(); i++)
		{
			_typeList.add("2");
			_codeList.add("");
			_messageList.add(_infoList.get(i).toString());
		}

	}

}

