/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/util/DataNotFoundException.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.util;

import com.nec.jp.orteus.metamorBase.util.AlarmMessage.*;

/**
 * データベース検索時に該当レコードが存在しない場合に使用される例外です。
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:39 $
 */
public class DataNotFoundException extends Exception {

	/** メッセージ管理部品 */
	AlarmMessage message = new AlarmMessage();

	/**
	 * 指定されたエラーコードを使用して新規例外を構築します。
	 * @param code エラーコード
	 */
	public DataNotFoundException(String code) {
		super();
		message.setCode(code);
	}

	/**
	 * 指定されたエラーコードおよび原因を使用して新規例外を構築します。 
	 * @param code エラーコード
	 * @param cause 原因
	 */
	public DataNotFoundException(String code, Throwable cause) {
		super(cause);
		message.setCode(code);
	}

	/**
	 * エラーコードを返します。
	 * @return エラーコード
	 */
	public String getCode() {
		return message.getCode();
	}

	/**
	 * エラーコードより取得したメッセージを返します。
	 * @return メッセージ
	 */
	public String getMessage() {
		return message.getMessage();
	}
}
