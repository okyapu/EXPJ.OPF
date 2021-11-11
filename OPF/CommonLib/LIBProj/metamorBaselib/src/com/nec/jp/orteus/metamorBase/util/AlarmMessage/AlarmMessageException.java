//------------------------------------------------------------------------------
// (#)AlarmMessageException.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/06/09 新規作成 K.Matsumoto
// 2003/06/25 Copyrightの記述修正 Y.Inada
//            前：Copyright (c) 2003 NEC informatec Systems,Ltd.
//            後：Copyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc用コメントの体裁を整える
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.AlarmMessage;

import javax.servlet.http.HttpServletRequest;

/**
 * メッセージを例外として取り扱う。<br>
 * メッセージの内容はメッセージ定義ファイルから取得する。
 *
 * @author  K.Matsumoto
 * @version 1.00
 */
public class AlarmMessageException extends RuntimeException
{

    /** メッセージリスト */
    private AlarmMessageList _messages = null;

    /**
     * メッセージリストを生成する。
	 */
    public AlarmMessageException() {
        super();
        _messages = new AlarmMessageList();
    }

    /**
     * メッセージリストを生成し、
     * 指定したメッセージコード、メッセージに埋め込む文字列で１メッセージ生成し、追加する。
     *
     * @param code メッセージコード
     * @param value メッセージに埋め込む文字列
	 */
    public AlarmMessageException(String code, String value) {
        this();
        _messages.add(code, value);
    }

    /**
     * メッセージリストを生成し、
     * 指定したメッセージコード、メッセージに埋め込む文字列で１メッセージ生成し、追加する。
     *
     * @param code メッセージコード
     * @param value メッセージに埋め込む文字列
	 */
    public AlarmMessageException(String code, String[] value) {
        this();
        _messages.add(code, value);
    }

    /**
     * メッセージリストを生成し、指定したメッセージを追加する。
     *
     * @param message メッセージ
	 */
    public AlarmMessageException(AlarmMessage message) {
        this();
        _messages.add(message);
    }

    /**
     * メッセージリストを生成し、指定したメッセージを追加する。
     *
     * @param messages メッセージ
	 */
    public AlarmMessageException(AlarmMessageList messages) {
        this();
        _messages.add(messages);
        _messages.setTitleCode(messages.getTitleCode());
    }

    /**
     * メッセージリストを生成し、タイトルコードを設定する。
     *
     * @param titleCode タイトルコード
	 */
    public AlarmMessageException(String titleCode) {
        this();
        _messages.setTitleCode(titleCode);
    }

    /**
     * メッセージリストを生成し、タイトルコードを設定する。
     * また、指定したメッセージコード、メッセージに埋め込む文字列で１メッセージ生成し、追加する。
     *
     * @param titleCode タイトルコード
     * @param code タイトルコード
     * @param value メッセージに埋め込む文字列
	 */
    public AlarmMessageException(String titleCode, String code, String value) {
        this();
        _messages.setTitleCode(titleCode);
        _messages.add(code, value);
    }

    /**
     * メッセージリストを生成し、タイトルコードを設定する。
     * また、指定したメッセージコード、メッセージに埋め込む文字列で１メッセージ生成し、追加する。
     *
     * @param titleCode タイトルコード
     * @param code タイトルコード
     * @param value1 メッセージに埋め込む文字列1
     * @param value2 メッセージに埋め込む文字列2
	 */
    public AlarmMessageException(String titleCode, String code, String value1, String value2) {
        this();
        _messages.setTitleCode(titleCode);
        _messages.add(code, value1, value2);
    }

    /**
     * メッセージリストを生成し、タイトルコードを設定する。
     * また、指定したメッセージコード、メッセージに埋め込む文字列で１メッセージ生成し、追加する。
     *
     * @param titleCode タイトルコード
     * @param code タイトルコード
     * @param value1 メッセージに埋め込む文字列1
     * @param value2 メッセージに埋め込む文字列2
     * @param value3 メッセージに埋め込む文字列3
	 */
    public AlarmMessageException(String titleCode, String code, String value1, String value2, String value3) {
        this();
        _messages.setTitleCode(titleCode);
        _messages.add(code, value1, value2, value3);
    }

    /**
     * メッセージリストを生成し、タイトルコードを設定する。
     * また、指定したメッセージコード、メッセージに埋め込む文字列で１メッセージ生成し、追加する。
     *
     * @param titleCode タイトルコード
     * @param code タイトルコード
     * @param value メッセージに埋め込む文字列
	 */
    public AlarmMessageException(String titleCode, String code, String[] value) {
        this();
        _messages.setTitleCode(titleCode);
        _messages.add(code, value);
    }

    /**

     * メッセージリストを生成し、
     * タイトルコードを設定して、指定されたメッセージを追加する。
     *
     * @param titleCode タイトルコード
     * @param message メッセージ
	 */
    public AlarmMessageException(String titleCode, AlarmMessage message) {
        this();
        _messages.setTitleCode(titleCode);
        _messages.add(message);
    }

    /**
     * メッセージリストを生成し、
     * タイトルコードを設定して、指定されたメッセージを追加する。
     *
     * @param titleCode タイトルコード
     * @param messages メッセージ
	 */
    public AlarmMessageException(String titleCode, AlarmMessageList messages) {
        this();
        _messages.setTitleCode(titleCode);
        _messages.add(messages);
    }

    /**
     * メッセージクラスを返す。
     *
     * @return メッセージ
	 */
    public AlarmMessageList getMessages() {
        return _messages;
    }

    /**
     * タイトルコードのアクセッサ。
     *
     * @param titleCode タイトルコード
	 */
    public void setTitleCode(String titleCode) { _messages.setTitleCode(titleCode); }

    /**
     * タイトルコードのアクセッサ。
     *
     * @return タイトルコード
	 */
    public String getTitleCode() { return _messages.getTitleCode(); }

    /**
     * メッセージファイルより、指定されたタイトルコードのタイトルを取得する。
     *
     * @return タイトル
	 */
    public String getTitle() { return _messages.getTitle(); }

    /**
     * 指定したメッセージコードで１メッセージ生成し、メッセージリストに追加する。
     *
     * @param code メッセージコード
	 */
    public void add(String code) {_messages.add(code);}

    /**
     * 指定したメッセージコードと、メッセージに埋め込む文字列で１メッセージ生成し、
     * メッセージリストに追加する。
     *
     * @param code メッセージコード
     * @param value メッセージに埋め込む値
	 */
    public void add(String code, String value) {
        _messages.add(code, value);
    }

    /**
     * 指定したメッセージコードと、メッセージに埋め込む文字列で１メッセージ生成し、
     * メッセージリストに追加する。
     *
     * @param code メッセージコード
     * @param value1 メッセージに埋め込む値1
     * @param value2 メッセージに埋め込む値2
	 */
    public void add(String code, String value1, String value2) {
        _messages.add(code, value1, value2);
    }

    /**
     * 指定したメッセージコードと、メッセージに埋め込む文字列で１メッセージ生成し、
     * メッセージリストに追加する。
     *
     * @param code メッセージコード
     * @param value1 メッセージに埋め込む値1
     * @param value2 メッセージに埋め込む値2
     * @param value3 メッセージに埋め込む値3
	 */
    public void add(String code, String value1, String value2, String value3) {
        _messages.add(code, value1, value2, value3);
    }

    /**
     * 指定したメッセージコードと、メッセージに埋め込む文字列で１メッセージ生成し、
     * メッセージリストに追加する。
     *
     * @param code メッセージコード
     * @param value メッセージに埋め込む値
	 */
    public void add(String code, String[] value) {
        _messages.add(code, value);
    }

    /**
     * 指定したメッセージリストをメッセージリストに追加する。
     *
     * @param messages メッセージリスト
	 */
    public void add(AlarmMessageList messages) {
        _messages.add(messages);
    }

    /**
     * 指定したメッセージをメッセージリストに追加する。
     *
     * @param message メッセージ
	 */
    public void add(AlarmMessage message) {
        _messages.add(message);
    }

    /**
     * リクエストにメッセージをセットする。
     *
     * @param request リクエスト
	 */
    public void setToRequest(HttpServletRequest request) {
        _messages.setToRequest(request);
    }

    /**
     * メッセージのカレントを初期化する。
	 */
    public void resetCurrent() {
        _messages.resetCurrent();
    }

    /**
     * メッセージリストのカレントを一つ進め、次メッセージの有無を返す。
     *
     * @return 次メッセージの有無 true:有  false:無
	 */
    public boolean next() {
        return _messages.next();
    }

    /**
     * メッセージをクリア。
	 */
    public void clear() {
        _messages.clear();
    }

    /**
     * メッセージの有無。
     *
     * @return メッセージの有無 true:無  false:有
	 */
    public boolean isEmpty() {
        return _messages.isEmpty();
    }

    /**
     * カレントメッセージに対するメッセージコードアクセッサ。
     *
     * @return メッセージコード
	 */
    public String getCode() {
        return _messages.getCode();
    }

    /**
     * カレントメッセージに対するメッセージに埋め込む文字列のアクセッサ。
     *
     * @return メッセージに埋め込む文字列
	 */
    public String getValue() {
        return _messages.getValue();
    }

    /**
     * カレントメッセージに対するメッセージに埋め込む文字列のアクセッサ。
     *
     * @param idx 配列のインデックス
     * @return メッセージに埋め込む文字列
	 */
    public String getValue(int idx) {
        return _messages.getValue(idx);
    }

    /**
     * カレントメッセージに対するメッセージに埋め込む文字列のアクセッサ。
     *
     * @return メッセージに埋め込む文字列
	 */
    public String[] getValues() {
        return _messages.getValues();
    }

    /**
     * メッセージファイルからカレントメッセージコードのメッセージを取得する。
     *
     * @return メッセージ
	 */
    public String getMessage() {
        try {
            return _messages.getMessage();
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * メッセージ表示用JSPのURLを取得する。
     *
     * @return URL
	 */
    public String getJspUrl() {
		return _messages.getJspUrl();
    }
}
