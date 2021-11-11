/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/ExpjException.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */
package com.nec.jp.orteus.expj.util;

import javax.servlet.http.HttpServletRequest;
import com.nec.jp.orteus.xaf.wa.BusinessProcessException;
import com.nec.jp.orteus.util.CoreTools;

 /**
 * メッセージを例外として取り扱うクラス。<br>
 * メッセージの内容はメッセージ定義ファイルから取得します。
 *
 * @see ExpjMessage
 * @see ExpjMessageList
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.4 $ $Date: 2013/06/27 02:50:48 $
*/
public class ExpjException extends BusinessProcessException
{

	/**
	 * メッセージ
	 */
	ExpjMessage _message = null;

	/**
	 * ロケール
	 */
	String _locale = "ja";

	Throwable _cause = null;
	
	/**
	 * エクセプションを生成します。
	 */
	public ExpjException() {
		super("COMMON-N000","EXPLANNER/J ERROR");
	}

	/**
	 * スタックトレースを受け継いでエクセプションを生成します。
	 *
	 * @param cause スタックトレース
	 */
	public ExpjException(Throwable cause) {
		this();
		initCause(cause);
		_message = null;
	}

	/**
	 * エクセプションを生成し、指定したメッセージを設定します。
	 *
	 * @param message メッセージ
	 */
	public ExpjException(ExpjMessage message) {
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
	public ExpjException(Throwable cause, ExpjMessage message) {
		this();
		initCause(cause);
		_message = message;
		_cause = cause;
	}

	/**
	 * エクセプションを生成し、
	 * 指定したメッセージリストでメッセージを生成し設定します。
	 *
	 * @param message メッセージに埋め込む文字列
	 * @deprecated このメソッドはEXPLANNER/Jでは推奨されていません。
	 */
	public ExpjException(ExpjMessageList message) {
		this();
		_message =  new ExpjMessage("ZZ01006", message.getMessage());;
	}

	/**
	 * スタックトレースを受け継いでエクセプションを生成し、
	 * 指定したメッセージリストでメッセージを生成し設定します。
	 *
	 * @param cause スタックトレース
	 * @param message メッセージに埋め込む文字列
	 * @deprecated このメソッドはEXPLANNER/Jでは推奨されていません。
	 */
	public ExpjException(Throwable cause, ExpjMessageList message) {
		this();
		initCause(cause);
		_message =  new ExpjMessage("ZZ01006", message.getMessage());;
	}

	/**
	 * エクセプションを生成し、
	 * 指定したメッセージコードでメッセージを生成し設定します。
	 *
	 * @param code メッセージコード
	 */
	public ExpjException(String code) {
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
	public ExpjException(Throwable cause, String code) {
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
	public ExpjException(String code, String value) {
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
	public ExpjException(Throwable cause, String code, String value) {
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
	public ExpjException(String code, String[] value) {
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
	public ExpjException(Throwable cause, String code, String[] value) {
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
	 *
	 * @param locale ロケール
	 */
	public void setLocale(String locale) {
		_locale = locale;
		if(_cause instanceof ExpjException) {
			((ExpjException)_cause).setLocale(_locale);
		}
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
			return _message.getMessage(_locale);
		} catch (Exception e) {
			return "";
		}
	}

	/**
	 * メッセージ文字列を取得します。
	 *
	 * @param locale ロケール
	 * @return ロケールに対応したメッセージ
	 */
	public String getMessage(String locale) {
		try {
			return _message.getMessage(locale);
		} catch (Exception e) {
			return "";
		}
	}

	/**
	 * メッセージ表示用JSPのURLを取得します。
	 *
	 * @return URL
	 * @deprecated このメソッドはEXPLANNER/Jでは推奨されていません。
	 */
	public String getJspUrl() {
		return new String("/ExpjMessage.jsp");
	}


	/**
	 * リクエストにメッセージをセットします。
	 *
	 * @param request リクエスト
	 */
	public void setToRequest(HttpServletRequest request) {
		request.setAttribute("msg", _message);
	}

}
