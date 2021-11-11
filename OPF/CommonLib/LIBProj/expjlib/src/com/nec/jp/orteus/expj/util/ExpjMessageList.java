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
 * AlarmMessageExceptionをExpjExceptionに変換するためのクラス。<br>
 * AlarmMessageExceptionをEXPLANNER/Jから一掃できたあかつきには不要になります。<br>
 * 上記変換以外の用途には使用しないでください。
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
	 * 指定されたエクセプションからメッセージを取り出して設定します。
	 *
	 * @param message エクセプション
	 */
	public ExpjMessageList(AlarmMessageException message) {
		_message = message.getMessages();
	}

	/**
	 * 指定されたリストからメッセージを取り出して設定します。
	 *
	 * @param message リスト
	 */
	public ExpjMessageList(AlarmMessageList message) {
		_message = message;
	}

	/**
	 * 指定されたエクセプションからメッセージを取り出して設定します。
	 *
	 * @param message エクセプション
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
	 * 指定されたエクセプションからメッセージを取り出して設定します。
	 *
	 * @param message エクセプション
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