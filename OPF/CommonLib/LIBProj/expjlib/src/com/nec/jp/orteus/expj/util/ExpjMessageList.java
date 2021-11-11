/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/ExpjMessageList.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageList;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;

/**
 * AlarmMessageException��ExpjException�ɕϊ����邽�߂̃N���X�B<br>
 * AlarmMessageException��EXPLANNER/J�����|�ł����������ɂ͕s�v�ɂȂ�܂��B<br>
 * ��L�ϊ��ȊO�̗p�r�ɂ͎g�p���Ȃ��ł��������B
 *
 * @see AlarmMessageList
 * @see AlarmMessageException
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:12 $
 */
public class ExpjMessageList extends AlarmMessageList
{
	AlarmMessageList _message = null;

	/**
	 * �w�肳�ꂽ�G�N�Z�v�V�������烁�b�Z�[�W�����o���Đݒ肵�܂��B
	 *
	 * @param message �G�N�Z�v�V����
	 */
	public ExpjMessageList(AlarmMessageException message) {
		_message = message.getMessages();
	}

	/**
	 * �w�肳�ꂽ���X�g���烁�b�Z�[�W�����o���Đݒ肵�܂��B
	 *
	 * @param message ���X�g
	 */
	public ExpjMessageList(AlarmMessageList message) {
		_message = message;
	}

	/**
	 * �w�肳�ꂽ�G�N�Z�v�V�������烁�b�Z�[�W�����o���Đݒ肵�܂��B
	 *
	 * @param message �G�N�Z�v�V����
	 */
	public String getMessage() {
		String msg = null;
		_message.resetCurrent();
		for(; _message.next() == true; ) {
			msg = msg + _message.getMessage() + "<br>";
		}
		return msg;
	}

	/**
	 * �w�肳�ꂽ�G�N�Z�v�V�������烁�b�Z�[�W�����o���Đݒ肵�܂��B
	 *
	 * @param message �G�N�Z�v�V����
	 */
	public String getMessage(AlarmMessageList message) {
		_message = message;
		String msg = null;
		_message.resetCurrent();
		for(; _message.next() == true; ) {
			msg = msg + _message.getMessage() + "<br>";
		}
		return msg;
	}
}