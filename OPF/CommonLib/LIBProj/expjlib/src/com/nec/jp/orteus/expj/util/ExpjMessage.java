/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/ExpjMessage.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

import java.util.ResourceBundle;
import java.text.MessageFormat;
import java.util.MissingResourceException;
import com.nec.jp.orteus.util.CoreTools;

/**
 * １メッセージの情報を保持するクラス<br>
 * メッセージの内容はメッセージ定義ファイルから取得します
 * @see ExpjException
 * @see ExpjMessageList
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:12 $
 */
public class ExpjMessage implements java.io.Serializable
{

	/**
	 * メッセージプロパティファイル
	 */
	private static ResourceBundle _messages = null;

	/**
	 * ロケール
	 */
	private static String _locale = null;

	/**
	 * メッセージコード
	 */
	private String _code = null;

	/**
	 * メッセージに埋め込む文字列
	 */
	private String[] _value = null;

	/**
	 * 空のメッセージコードとメッセージに埋め込む文字列を設定します。
	 */
	public ExpjMessage() {
		init("ZZ01006", new String[0]);
	}

	/**
	 * 指定されたメッセージコードを設定します。
	 *
	 * @param code メッセージコード
	 */
	public ExpjMessage(String code) {
		init(code, new String[0]);
	}

	/**
	 * 指定されたメッセージコードとメッセージに埋め込む文字列を設定します。
	 *
	 * @param code  メッセージコード
	 * @param value メッセージに埋め込む文字列
	 */
	public ExpjMessage(String code, String value) {
		init(code, str2array(value));
	}

	/**
	 * 指定されたメッセージコードとメッセージに埋め込む文字列１、文字列２を設定します。
	 *
	 * @param code  メッセージコード
	 * @param value1 メッセージに埋め込む文字列１
	 * @param value2 メッセージに埋め込む文字列２
	 */
	public ExpjMessage(String code, String value1, String value2) {
		init(code, str2array(value1, value2));
	}

	/**
	 * 指定されたメッセージコードとメッセージに埋め込む文字列１～３を設定します。
	 *
	 * @param code  メッセージコード
	 * @param value1 メッセージに埋め込む文字列1
	 * @param value2 メッセージに埋め込む文字列2
	 * @param value3 メッセージに埋め込む文字列3
	 */
	public ExpjMessage(String code, String value1, String value2, String value3) {
		init(code, str2array(value1, value2, value3));
	}

	/**
	 * 指定されたメッセージコードとメッセージに埋め込む文字列（String[]型）を設定します。
	 *
	 * @param code  メッセージコード
	 * @param value メッセージに埋め込む文字列
	 */
	public ExpjMessage(String code, String[] value) {
		init(code, value);
	}

	/**
	 * メッセージコードとメッセージに埋め込む文字列を格納します。
	 *
	 * @param code  メッセージコード
	 * @param value メッセージに埋め込む文字列
	 */
	private void init(String code, String[] value) {
		setCode(code);
		setValue(value);
	}

	/**
	 * メッセージコードを格納するアクセッサ。
	 *
	 * @param code メッセージコード
	 */
	public void setCode(String code) {
		_code = code;
	}

	/**
	 * メッセージに埋め込む文字列を格納するアクセッサ。
	 *
	 * @param value メッセージに埋め込む文字列
	 */
	public void setValue(String value) {
		setValue(str2array(value));
	}

	/**
	 * メッセージに埋め込む文字列（String[]型）を格納するアクセッサ。
	 *
	 * @param value メッセージに埋め込む文字列（String[]型）
	 */
	public void setValue(String[] value) {
		_value = value;
	}

	/**
	 * メッセージコードを取得するアクセッサ。
	 *
	 * @return メッセージコード
	 */
	public String getCode() {
		return _code.toString();
	}

	/**
	 * メッセージに埋め込む文字列を取得するアクセッサ
	 *
	 * @return メッセージに埋め込む文字列
	 */
	public String getValue() {
		return getValue(0);
	}

	/**
	 * メッセージに埋め込む文字列の idx 番目の値を取得するアクセッサ
	 *
	 * @param idx 配列のインデックス
	 * @return メッセージに埋め込む文字列、取得できない場合は空文字を返します。
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
	 * メッセージに埋め込む文字列を取得するアクセッサ。
	 *
	 * @return メッセージに埋め込む文字列
	 */
	public String[] getValues() {
		return _value;
	}

	/**
	 * メッセージに埋め込む文字列を追加するアクセッサ。
	 *
	 * @param value メッセージに埋め込む文字列
	 */
	public void addValue(String value) {
		addValue(str2array(value));
	}

	/**
	 * メッセージに埋め込む文字列を追加するアクセッサ。
	 *
	 * @param value メッセージに埋め込む文字列
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
	 * メッセージに埋め込む文字列の件数を返します。
	 *
	 * @return 文字列の件数
	 */
	public int getValueSize() {
		if (getValues() == null) {
			return 0;
		}
		return getValues().length;
	}

	/**
	 * メッセージファイルから、指定されたメッセージコードのメッセージをデフォルトのロケールで取得し、
	 * 取得したメッセージに指定文字列を挿入して返します。
	 *
	 * @return メッセージ
	 */
	public String getMessage() {
		return getMessage(CoreTools.getLocale(null));
	}

	/**
	 * メッセージファイルから、指定されたメッセージコードのメッセージを取得し、
	 * 取得したメッセージに指定文字列を挿入して返します。
	 *
	 * @param locale ロケール
	 * @return メッセージ
	 */
	public String getMessage(String locale) {
		String msg = getProperty(getCode(), locale);
		return MessageFormat.format(msg, getValues());
	}

	/**
	 * デフォルト言語でメッセージ文字列を取得します。
	 *
	 * @return メッセージ
	 */
	public String getStringMessage() {
		return getStringMessage(CoreTools.getLocale(null));
	}

	/**
	 * メッセージ文字列を取得します。
	 *
	 * @param locale ロケール
	 * @return ロケールに対応したメッセージ
	 */
	public String getStringMessage(String locale) {
		try {
			return "[" + getCode() + "] " + getMessage(locale);
		} catch (Exception e) {
			return "";
		}
	}

	/**
	 * メッセージ定義ファイルから指定されたメッセージコードのメッセージを取得します。<br>
	 * メッセージ定義ファイルが見つからなかった場合は、"メッセージ定義ファイルが見つかりません。"という文字列を返します。<br>
	 * 指定されたメッセージキーに対応するメッセージ本文が見つからなかった場合は、
	 * "メッセージキー" + code + "に対応するメッセージがありません。"という文字列を返します。<br>
	 *
	 * @param code メッセージコード
	 * @param locale 言語コード
	 * @return メッセージ
	 */
	static synchronized String getProperty(String code, String locale) {
		try {
			if ((_messages == null) || (!locale.equals(_locale))) {
				_locale = locale;
				if (CoreTools.getLocale(null).equals(locale)) {
					_messages = ResourceBundle.getBundle("ExpjMessage");
				} else {
					_messages = CoreTools.getResourceBundle("ExpjMessage", locale);
				}
			}
		}
		catch (MissingResourceException e) {
			return new String("Locale Message Definition File \"ExpjMessage.properties\" not found.");
		}

		String val = null;
		try {
			val = _messages.getString(code);
		}
		catch (MissingResourceException e) {
			val = new String("Message Key [" + code + "] does not have Message text.");
		}
		return val;
	}

	/**
	 * 文字列を配列に変換します
	 *
	 * @param value 文字列
	 * @return 配列
	 */
	private String[] str2array(String value) {
		String[] temp = new String[1];
		temp[0] = value;
		return temp;
	}

	/**
	 * 文字列を配列に変換します
	 *
	 * @param value1 文字列
	 * @param value2 文字列
	 * @return 配列
	 */
	private String[] str2array(String value1, String value2) {
		String[] temp = new String[2];
		temp[0] = value1;
		temp[1] = value2;
		return temp;
	}

	/**
	 * 文字列を配列に変換します
	 *
	 * @param value1 文字列
	 * @param value2 文字列
	 * @param value3 文字列
	 * @return 配列
	 */
	private String[] str2array(String value1, String value2, String value3) {
		String[] temp = new String[3];
		temp[0] = value1;
		temp[1] = value2;
		temp[2] = value3;
		return temp;
	}

}
