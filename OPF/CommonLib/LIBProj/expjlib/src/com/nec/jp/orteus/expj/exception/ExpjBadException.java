/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/exception/ExpjBadException.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.exception;

import com.nec.jp.orteus.expj.util.*;

 /**
 * メッセージを例外として取り扱うクラス。<br>
 * メッセージの内容はメッセージ定義ファイルから取得します。
 * ExpjExceptionの、ControlからThrowさせない版
 *
 * @see ExpjMessage
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:27:53 $
*/
public class ExpjBadException extends Exception
{

	/**
	 * メッセージ
	 */
	ExpjMessage _message = null;

	/**
	 * ロケール
	 */
	String _locale = "ja";

	/**
	 * エクセプションを生成します。
	 */
	public ExpjBadException() {
		super();
	}

	/**
	 * スタックトレースを受け継いでエクセプションを生成します。
	 *
	 * @param cause スタックトレース
	 */
	public ExpjBadException(Throwable cause) {
		this();
		initCause(cause);
		_message = null;
	}

	/**
	 * エクセプションを生成し、指定したメッセージを設定します。
	 *
	 * @param message メッセージ
	 */
	public ExpjBadException(ExpjMessage message) {
		this();
		_message = message;
	}

	/**
	 * スタックトレースを受け継いでエクセプションを生成し、
	 * 指定したメッセージを設定します。
	 *
	 * @param cause スタックトレース
	 * @param message メッセージ
	 */
	public ExpjBadException(Throwable cause, ExpjMessage message) {
		this();
		initCause(cause);
		_message = message;
	}

	/**
	 * エクセプションを生成し、
	 * 指定したメッセージコードでメッセージを生成し設定します。
	 *
	 * @param code メッセージコード
	 */
	public ExpjBadException(String code) {
		this();
		_message = new ExpjMessage(code);
	}

	/**
	 * スタックトレースを受け継いでエクセプションを生成し、
	 * 指定したメッセージコードでメッセージを生成し設定します。
	 *
	 * @param cause スタックトレース
	 * @param code メッセージコード
	 */
	public ExpjBadException(Throwable cause, String code) {
		this();
		initCause(cause);
		_message = new ExpjMessage(code);
	}

	/**
	 * エクセプションを生成し、
	 * 指定したメッセージコード＋メッセージに埋め込む文字列で１メッセージ生成し設定します。
	 *
	 * @param code メッセージコード
	 * @param value メッセージに埋め込む文字列
	 */
	public ExpjBadException(String code, String value) {
		this();
		_message = new ExpjMessage(code, value);
	}

	/**
	 * スタックトレースを受け継いでエクセプションを生成し、
	 * 指定したメッセージコード、メッセージに埋め込む文字列で１メッセージ生成し設定します。
	 *
	 * @param cause スタックトレース
	 * @param code メッセージコード
	 * @param value メッセージに埋め込む文字列
	 */
	public ExpjBadException(Throwable cause, String code, String value) {
		this();
		initCause(cause);
		_message = new ExpjMessage(code, value);
	}

	/**
	 * エクセプションを生成し、
	 * 指定したメッセージコード＋メッセージに埋め込む文字列で１メッセージ生成し設定します。
	 *
	 * @param code メッセージコード
	 * @param value メッセージに埋め込む文字列
	 * @deprecated このメソッドはEXPLANNER/Jでは推奨されていません。
	 */
	public ExpjBadException(String code, String[] value) {
		this();
		_message = new ExpjMessage(code, value);
	}

	/**
	 * スタックトレースを受け継いでエクセプションを生成し、
	 * 指定したメッセージコード、メッセージに埋め込む文字列で１メッセージ生成し設定します。
	 *
	 * @param cause スタックトレース
	 * @param code メッセージコード
	 * @param value メッセージに埋め込む文字列
	 * @deprecated このメソッドはEXPLANNER/Jでは推奨されていません。
	 */
	public ExpjBadException(Throwable cause, String code, String[] value) {
		this();
		initCause(cause);
		_message = new ExpjMessage(code, value);
	}



	/**
	 * 何もしません。コンパイルエラーが出ないことだけを目的にしています。
	 *
	 * @param message メッセージ
	 * @deprecated このメソッドはEXPLANNER/Jでは推奨されていません。
	 */
	public void add(ExpjMessage message) {
	}

	/**
	 * 何もしません。コンパイルエラーが出ないことだけを目的にしています。
	 *
	 * @param code メッセージコード
	 * @deprecated このメソッドはEXPLANNER/Jでは推奨されていません。
	 */
	public void add(String code) {
	}

	/**
	 * 何もしません。コンパイルエラーが出ないことだけを目的にしています。
	 *
	 * @param code メッセージコード
	 * @param value メッセージに埋め込む値
	 * @deprecated このメソッドはEXPLANNER/Jでは推奨されていません。
	 */
	public void add(String code, String value) {
	}

	/**
	 * 何もしません。コンパイルエラーが出ないことだけを目的にしています。
	 *
	 * @param code メッセージコード
	 * @param value1 メッセージに埋め込む値1
	 * @param value2 メッセージに埋め込む値2
	 * @deprecated このメソッドはEXPLANNER/Jでは推奨されていません。
	 */
	public void add(String code, String value1, String value2) {
	}

	/**
	 * 何もしません。コンパイルエラーが出ないことだけを目的にしています。
	 *
	 * @param code メッセージコード
	 * @param value1 メッセージに埋め込む値1
	 * @param value2 メッセージに埋め込む値2
	 * @param value3 メッセージに埋め込む値3
	 * @deprecated このメソッドはEXPLANNER/Jでは推奨されていません。
	 */
	public void add(String code, String value1, String value2, String value3) {
	}

	/**
	 * 何もしません。コンパイルエラーが出ないことだけを目的にしています。
	 *
	 * @param code メッセージコード
	 * @param value メッセージに埋め込む値
	 * @deprecated このメソッドはEXPLANNER/Jでは推奨されていません。
	 */
	public void add(String code, String[] value) {
	}



	/**
	 * ロケールを設定します。
	 */
	public void setLocale(String locale) {
		_locale = locale;
	}

	/**
	 * メッセージをクリア。
	 */
	public void clear() {
		_message = null;
	}

	/**
	 * メッセージを取得します。
	 *
	 * @return メッセージ
	 */
	public ExpjMessage getExpjMessage() {
		return _message;
	}

	/**
	 * メッセージのメッセージコードを取得します。
	 *
	 * @return メッセージコード
	 */
	public String getCode() {
		try {
			return _message.getCode();
		} catch (Exception e) {
			return "";
		}
	}

	/**
	 * デフォルト言語でメッセージ文字列を取得します。
	 *
	 * @return メッセージ
	 */
	public String getMessage() {
		try {
			return _message.getMessage("ja");
		} catch (Exception e) {
			return "";
		}
	}

	/**
	 * メッセージ文字列を取得します。
	 *
	 * @return ロケールに対応したメッセージ
	 */
	public String getMessage(String locale) {
		try {
			return _message.getMessage(locale);
		} catch (Exception e) {
			return "";
		}
	}

}
