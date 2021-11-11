//------------------------------------------------------------------------------
// (#)AlarmMessageList.java
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

import java.util.Vector;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.servlet.http.HttpServletRequest;

/**
 * 複数メッセージの情報を保持する。<br>
 * メッセージの内容はメッセージ定義ファイルから取得する。
 *
 * @author  K.Matsumoto
 * @version 1.00
 */
public class AlarmMessageList implements java.io.Serializable {

    /** タイトルコード */
    private String _titleCode = null;

    /** カレントメッセージ */
    private AlarmMessage _aMessage = null;

    /** メッセージリスト */
    private Vector _messageList = new Vector();

    /** メッセージイテレータ */
    private Iterator _iterator = null;

    /** メッセージ表示用のJSP */
    private static final String _url = "/AlarmMessage.jsp";

    /**
     * 空のメッセージリストを構築する。
	 */
    public AlarmMessageList() {}

    /**
     * 指定したメッセージをメッセージリストに追加する。
     *
     * @param message メッセージ
	 */
    public AlarmMessageList(AlarmMessage message) { add(message); }

    /**
     * 指定したメッセージをメッセージリストに追加する。
     *
     * @param messageList メッセージ
	 */
    public AlarmMessageList(AlarmMessageList messageList) { add(messageList); }

    /**
     * 指定したメッセージコードと、メッセージに埋め込む文字列で１メッセージ生成し、
     * メッセージリストに追加する。
     *
     * @param code メッセージコード
     * @param value メッセージに埋め込む文字列
	 */
    public AlarmMessageList(String code, String value) { add(code, value); }

    /**
     * 指定したメッセージコードと、メッセージに埋め込む文字列で１メッセージ生成し、
     * メッセージリストに追加する。
     *
     * @param code メッセージコード
     * @param value メッセージに埋め込む文字列
	 */
    public AlarmMessageList(String code, String[] value) { add(code, value); }

    /**
     * タイトルコードを設定する。
     *
     * @param titleCode タイトルコード
	 */
    public AlarmMessageList(String titleCode) { setTitleCode(titleCode); }

    /**
     * タイトルコードを設定する。<br>
     * また、指定したメッセージコードと、メッセージに埋め込む文字列で１メッセージ生成し、
     * メッセージリストに追加する。
     *
     * @param titleCode タイトルコード
     * @param code メッセージコード
     * @param value メッセージに埋め込む文字列
	 */
    public AlarmMessageList(String titleCode, String code, String value) {
        setTitleCode(titleCode);
        add(code, value);
    }

    /**
     * タイトルコードを設定する。<br>
     * また、指定したメッセージコードと、メッセージに埋め込む文字列で１メッセージ生成し、
     * メッセージリストに追加する。
     *
     * @param titleCode タイトルコード
     * @param code メッセージコード
     * @param value メッセージに埋め込む文字列
	 */
    public AlarmMessageList(String titleCode, String code, String[] value) {
        setTitleCode(titleCode);
        add(code, value);
    }

    /**
     * タイトルコードを設定する。<br>
     * また、指定したメッセージコードと、メッセージに埋め込む文字列で１メッセージ生成し、
     * メッセージリストに追加する。
     *
     * @param titleCode タイトルコード
     * @param code メッセージコード
     * @param value1 メッセージに埋め込む文字列1
     * @param value2 メッセージに埋め込む文字列2
	 */
    public AlarmMessageList(String titleCode, String code, String value1, String value2) {
        setTitleCode(titleCode);
        add(code, value1, value2);
    }

    /**
     * タイトルコードを設定する。<br>
     * また、指定したメッセージコードと、メッセージに埋め込む文字列で１メッセージ生成し、
     * メッセージリストに追加する。
     *
     * @param titleCode タイトルコード
     * @param code メッセージコード
     * @param value1 メッセージに埋め込む文字列1
     * @param value2 メッセージに埋め込む文字列2
     * @param value3 メッセージに埋め込む文字列3
	 */
    public AlarmMessageList(String titleCode, String code, String value1, String value2, String value3) {
        setTitleCode(titleCode);
        add(code, value1, value2, value3);
    }

    /**
     * タイトルコードを設定し、指定したメッセージをメッセージリストに追加する。<br>
     *
     * @param titleCode タイトルコード
     * @param message メッセージ
	 */
    public AlarmMessageList(String titleCode, AlarmMessage message) {
        setTitleCode(titleCode);
        add(message);
    }

    /**
     * タイトルコードを設定し、指定したメッセージをメッセージリストに追加する。<br>
     *
     * @param titleCode タイトルコード
     * @param messageList メッセージリスト
	 */
    public AlarmMessageList(String titleCode, AlarmMessageList messageList) {
        setTitleCode(titleCode);
        add(messageList);
    }

    /**
     * タイトルコードのアクセッサ。
     *
     * @param titleCode タイトルコード
	 */
    public void setTitleCode(String titleCode) { _titleCode = titleCode; }

    /**
     * タイトルコードのアクセッサ。
     *
     * @return タイトルコード
	 */
    public String getTitleCode() { return _titleCode; }

    /**
     * メッセージファイルより、指定されたタイトルコードのタイトルを取得する。
     *
     * @return タイトル
	 */
    public String getTitle() {
        if (getTitleCode() == null) return null;
        return AlarmMessage.getProperty(getTitleCode());
    }

    /**
     * 指定したメッセージコードで１メッセージ生成し、メッセージリストに追加する。
     *
     * @param code メッセージコード
	 */
    public void add(String code) {add(code, "");}

    /**
     * 指定したメッセージコードと、メッセージに埋め込む文字列で１メッセージ生成し、
     * メッセージリストに追加する。
     *
     * @param code メッセージコード
     * @param value メッセージに埋め込む値
	 */
    public void add(String code, String value) {
        AlarmMessage work = new AlarmMessage(code, value);
        _messageList.addElement(work);
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
        AlarmMessage work = new AlarmMessage(code, value1, value2);
        _messageList.addElement(work);
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
        AlarmMessage work = new AlarmMessage(code, value1, value2, value3);
        _messageList.addElement(work);
    }

    /**
     * 指定したメッセージコードと、メッセージに埋め込む文字列で１メッセージ生成し、
     * メッセージリストに追加する。
     *
     * @param code メッセージコード
     * @param value メッセージに埋め込む値
	 */
    public void add(String code, String[] value) {
        AlarmMessage work = new AlarmMessage(code, value);
        _messageList.addElement(work);
    }

    /**
     * 指定したメッセージリストをメッセージリストに追加する。
     *
     * @param messageList メッセージリスト
	 */
    public void add(AlarmMessageList messageList) {
        while (messageList.next()) {
            add(messageList.getCode(), messageList.getValues());
        }
    }

    /**
     * 指定したメッセージをメッセージリストに追加する。
     *
     * @param message メッセージ
	 */
    public void add(AlarmMessage message) {
        _messageList.addElement(message);
    }

    /**
     * リクエストにメッセージをセットする。
     *
     * @param request リクエスト
	 */
    public void setToRequest(HttpServletRequest request) {
        request.setAttribute("msg", this);
    }

    /**
     * メッセージリストのイテレータを取得。
     *
     * @return イテレータ
	 */
    private Iterator getIterator() {
        if (_iterator == null) {
            _iterator = _messageList.iterator();
        }
        return _iterator;
    }

    /**
     * メッセージのカレントを初期化する。
	 */
    public void resetCurrent() {
        _iterator = _messageList.iterator();
    }

    /**
     * メッセージリストのカレントを一つ進め、次メッセージの有無を返す。
     *
     * @return 次メッセージの有無 true:有  false:無
	 */
    public boolean next() {
        boolean ret = getIterator().hasNext();
        if (ret == true) {
            _aMessage = (AlarmMessage) getIterator().next();
        }
        return ret;
    }

    /**
     * メッセージをクリア。
	 */
    public void clear() {
        _messageList.clear();
        _iterator = null;
        _aMessage = null;
        _titleCode = null;
    }

    /**
     * メッセージの有無。
     *
     * @return メッセージの有無 true:無  false:有
	 */
    public boolean isEmpty() {
        return _messageList.isEmpty();
    }

    /**
     * カレントメッセージに対するメッセージコードアクセッサ。
     *
     * @return メッセージコード
	 */
    public String getCode() {
        if (_aMessage == null) {
            throw new NoSuchElementException();
        }
        return _aMessage.getCode();
    }

    /**
     * カレントメッセージに対するメッセージに埋め込む文字列のアクセッサ。
     *
     * @return メッセージに埋め込む文字列
	 */
    public String getValue() {
        if (_aMessage == null) {
            throw new NoSuchElementException();
        }
        return _aMessage.getValue();
    }

    /**
     * カレントメッセージに対するメッセージに埋め込む文字列のアクセッサ。
     *
     * @param idx 配列のインデックス
     * @return メッセージに埋め込む文字列
	 */
    public String getValue(int idx) {
        if (_aMessage == null) {
            throw new NoSuchElementException();
        }
        return _aMessage.getValue(idx);
    }

    /**
     * カレントメッセージに対するメッセージに埋め込む文字列のアクセッサ。
     *
     * @return メッセージに埋め込む文字列
	 */
    public String[] getValues() {
        if (_aMessage == null) {
            throw new NoSuchElementException();
        }
        return _aMessage.getValues();
    }

    /**
     * メッセージファイルからカレントメッセージコードのメッセージを取得する。
     *
     * @return メッセージ
	 */
    public String getMessage() {
        if (_aMessage == null) {
            throw new NoSuchElementException();
        }
        return _aMessage.getMessage();
    }

    /**
     * メッセージ表示用JSPのURLを取得する。
     *
     * @return URL
	 */
    public String getJspUrl() {
		return _url;
    }
}
