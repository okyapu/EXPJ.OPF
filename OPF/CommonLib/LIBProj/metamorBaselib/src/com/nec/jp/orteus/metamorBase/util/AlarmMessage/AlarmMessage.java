//------------------------------------------------------------------------------
// (#)AlarmMessage.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/06/09 新規作成 K.Matsumoto
// 2003/06/25 Copyrightの記述修正 Y.Inada
//            前：Copyright (c) 2003 NEC informatec Systems,Ltd.
//            後：Copyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc用コメントの体裁を整える
// 2003/09/24 M.Hotokebuchi
//            メッセージのパラメータ補完文字列を "%0" から "{0}" に変更する
//            MessageFormat.format() を使用するよう修正(getMessage()メソッド)
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.AlarmMessage;

import java.util.ResourceBundle;
import java.text.MessageFormat;
import java.util.MissingResourceException;

/**
 * １メッセージの情報を保持する。<br>
 * メッセージの内容はメッセージ定義ファイルから取得する。
 *
 * @author  K.Matsumoto
 * @version 1.00
 */
public class AlarmMessage implements java.io.Serializable
{

    /** メッセージプロパティファイル */
    private static ResourceBundle _messages = null;

    /** メッセージコード */
    private String _code = null;

    /** メッセージに埋め込む文字列 */
    private String[] _value = null;

    /**
	 * コンストラクタ。
     */
    public AlarmMessage() {init("", new String[0]);}

    /**
     * 指定されたメッセージコードを設定する。
     *
     * @param code メッセージコード
	 */
    public AlarmMessage(String code) {init(code, new String[0]);}

    /**
     * 指定されたメッセージコードとメッセージに埋め込む文字列を設定する。
     *
     * @param code  メッセージコード
     * @param value メッセージに埋め込む文字列
	 */
    public AlarmMessage(String code, String value) {init(code, str2array(value));}

    /**
     * 指定されたメッセージコードとメッセージに埋め込む文字列を設定する。
     *
     * @param code  メッセージコード
     * @param value1 メッセージに埋め込む文字列1
     * @param value2 メッセージに埋め込む文字列2
	 */
    public AlarmMessage(String code, String value1, String value2) {
        init(code, str2array(value1, value2));
    }

    /**
     * 指定されたメッセージコードとメッセージに埋め込む文字列を設定する。
     *
     * @param code  メッセージコード
     * @param value1 メッセージに埋め込む文字列1
     * @param value2 メッセージに埋め込む文字列2
     * @param value3 メッセージに埋め込む文字列3
	 */
    public AlarmMessage(String code, String value1, String value2, String value3) {
        init(code, str2array(value1, value2, value3));
    }

    /**
     * 指定されたメッセージコードとメッセージに埋め込む文字列を設定する。
     *
     * @param code  メッセージコード
     * @param value メッセージに埋め込む文字列
	 */
    public AlarmMessage(String code, String[] value) {init(code, value);}

    /**
     * メッセージコードとメッセージに埋め込む文字列を設定する。
     *
     * @param code  メッセージコード
     * @param value メッセージに埋め込む文字列
	 */
    private void init(String code, String[] value) {
        setCode(code);
        setValue(value);
    }

    /**
     * メッセージコードのアクセッサ。
     *
     * @param code メッセージコード
	 */
    public void setCode(String code) {_code = code;}

    /**
     * メッセージに埋め込む文字列のアクセッサ。
     *
     * @param value メッセージに埋め込む文字列
	 */
    public void setValue(String value) { setValue(str2array(value)); }

    /**
     * メッセージに埋め込む文字列のアクセッサ。
     *
     * @param value メッセージに埋め込む文字列
	 */
    public void setValue(String[] value) {_value = value;}

    /**
     * メッセージコードのアクセッサ。
     *
     * @return メッセージコード
	 */
    public String getCode() {return _code.toString();}

    /**
     * メッセージに埋め込む文字列のアクセッサ
     *
     * @return メッセージに埋め込む文字列
	 */
    public String getValue() {return getValue(0);}

    /**
     * メッセージに埋め込む文字列のアクセッサ
     *
     * @param idx 配列のインデックス
     * @return メッセージに埋め込む文字列
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
     * メッセージに埋め込む文字列のアクセッサ。
     *
     * @return メッセージに埋め込む文字列
	 */
    public String[] getValues() {return _value;}

    /**
     * メッセージに埋め込む文字列のアクセッサ。
     *
     * @param value メッセージに埋め込む文字列
	 */
    public void addValue(String value) {
        addValue(str2array(value));
    }

    /**
     * メッセージに埋め込む文字列のアクセッサ。
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
     * メッセージに埋め込む文字列の件数を返す。
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
     * メッセージファイルから、指定されたメッセージコードのメッセージを取得し、<br>
     * 取得したメッセージに指定文字列を挿入して返す。
     *
     * @return メッセージ
	 */
    public String getMessage() {
        /* メッセージファイルから、指定されたメッセージコードのメッセージを取得する。 */
        String msg = getProperty(getCode());

        /* フォーマットされたメッセージを返す */
        return MessageFormat.format(msg, getValues());

    }

    /**
     * メッセージ定義ファイルから指定されたメッセージコードのメッセージを取得する。<br>
     * メッセージ定義ファイルが見つからなかった場合場合は、"メッセージ定義ファイルが見つかりません。"<br>
     * という文字列を返す。<br>
     * 指定されたメッセージキーに対応するメッセージ本文が見つからなかった場合は、<br>
     * "メッセージキー" + メッセージキー + "に対応するメッセージがありません。"という文字列を返す。<br>
     *
     * @param code メッセージコード
     * @return メッセージ
	 */
    static synchronized String getProperty(String code) {
		try {
	        if (_messages == null) {
				_messages = ResourceBundle.getBundle("AlarmMessage");
			}
		}
        catch (MissingResourceException e) {
			return new String("(SBM1203)メッセージ定義ファイルが見つかりません。");
        }

        String val = null;
        try {
            val = _messages.getString(code);
        }
        catch (MissingResourceException e) {
            val = new String("(SBM0835)メッセージキー " + code + " に対応するメッセージがありません。");
        }
        return val;
    }

    /**
     * 文字列を配列に変換<br>
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
     * 文字列を配列に変換<br>
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
     * 文字列を配列に変換<br>
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