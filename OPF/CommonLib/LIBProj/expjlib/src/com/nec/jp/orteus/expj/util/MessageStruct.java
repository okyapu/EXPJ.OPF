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
 * メッセージ。
 * メッセージ内容を保持クラス。
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:13 $
 */
public class MessageStruct {

	/**
	 * エラーのタイプ
	 */
	public final static int ERROR = 0;

	/**
	 * 警告のタイプ
	 */
	public final static int WARN = ERROR + 1;

	/**
	 * 情報のタイプ
	 */
	public final static int INFO = WARN + 1;

	/**
	 * メッセージタイプリスト
	 */
	private List _typeList = new ArrayList(0);

	/**
	 * メッセージコードリスト
	 */
	private List _codeList = new ArrayList(0);

	/**
	 * メッセージリスト
	 */
	private List _messageList = new ArrayList(0);

	/**
	 * エラーリスト
	 */
	private List _errorList = new ArrayList(0);

	/**
	 * 警告リスト
	 */
	private List _warnList = new ArrayList(0);

	/**
	 * 情報リスト
	 */
	private List _infoList = new ArrayList(0);

	/**
	 * ロケール
	 */
	private String _locale = null;

	/**
	  * コンストラクタ（デフォルトロケール）
	 */
	public MessageStruct() {
		this(null, false);
	}

	/**
	  * コンストラクタ（ロケール指定）
	 * @param locale 取得するメッセージのロケール
	 */
	public MessageStruct(String locale) {
		this(locale, true);
	}

	/**
	  * コンストラクタ（ロケール・ユーザ指定）
	 * @param code 取得するメッセージのロケール or ユーザCD
	 * @param localeFlg true:ロケール指定，false:ユーザ指定
	 */
	public MessageStruct(String code, boolean localeFlg) {
		if (localeFlg) {
			_locale = code;
		} else {
			_locale = CoreTools.getLocale(code);
		}
	}

	/**
	 * ロケールセット
	 * @param locale 取得するメッセージのロケール
	 */
	public void setLocale(String locale) {
		_locale = locale;
	}

	/**
	 * ロケール取得
	 * @return locale 取得するメッセージのロケール
	 */
	public String getLocale() {
		return _locale;
	}

	/**
	 * メッセージコードリスト取得
	 * @return メッセージコードリスト
	 */
	public List getCode(){
		return _codeList;
	}

	/**
	 * メッセージタイプリスト取得
	 * @return メッセージタイプリスト
	 */
	public List getType(){
		return _typeList;
	}

	/**
	 * メッセージリスト取得
	 * @return メッセージリスト
	 */
	public List getMessage(){
		if(getSize() < sizeError() + sizeWarn() + sizeInfo()) {
			RemakeMessage();
		}
		return _messageList;
	}

	/**
	 * エラーリスト取得
	 * @return エラーリスト
	 */
	public List getError()
	{
		return _errorList;
	}

	/**
	 * 警告リスト取得
	 * @return 警告リスト
	 */
	public List getWarn()
	{
		return _warnList;
	}

	/**
	 * 情報リスト取得
	 * @return 情報リスト
	 */
	public List getInfo()
	{
		return _infoList;
	}

	/**
	 * 指定された位置にあるメッセージコードを返します
	 * @param index 取得する位置
	 * @return メッセージコード
	 */
	public String getCode(int index){
		return _codeList.get(index).toString();
	}

	/**
	 * 指定された位置にあるメッセージタイプを返します
	 * @param index 取得する位置
	 * @return メッセージタイプ
	 */
	public int getType(int index){
		return Integer.parseInt(_typeList.get(index).toString());
	}

	/**
	 * 指定された位置にあるメッセージを返します
	 * @param index 取得する位置
	 * @return メッセージ
	 */
	public String getMessage(int index){
		return _messageList.get(index).toString();
	}


	/**
	 * メッセージタイプリスト設定
	 * @param list メッセージタイプリスト
	 */
	public void setType(List list){
		_typeList = list;
	}

	/**
	 * メッセージコードリスト設定
	 * @param list メッセージコードリスト
	 */
	public void setCode(List list){
		_codeList = list;
	}

	/**
	 * メッセージリスト設定
	 * @param list メッセージリスト
	 */
	public void setMessage(List list){
		_messageList = list;
	}

	/**
	 * エラーリスト設定
	 * @param list エラーリスト
	 */
	public void setError(List list)
	{
		_errorList = list;
	}

	/**
	 * 警告リスト設定
	 * @param list 警告リスト
	 */
	public void setWarn(List list)
	{
		_warnList = list;
	}

	/**
	 * 情報リスト設定
	 * @param list 情報リスト
	 */
	public void setInfo(List list)
	{
		_infoList = list;
	}


	/**
	 * メッセージ追加
	 * @param type メッセージのタイプ（エラー、警告、情報）
	 * @param msg メッセージ
	 */
	public void addMessage(int type, ExpjMessage msg)
	{
		addMessage(type, msg.getCode(), msg.getMessage(_locale));
	}

	/**
	 * エラーメッセージ追加
	 * @param msg エラーメッセージ
	 */
	public void addError(ExpjMessage msg)
	{
		addError(msg.getCode(), msg.getMessage(_locale));
	}

	/**
	 * 警告メッセージ追加
	 * @param msg 警告メッセージ
	 */
	public void addWarn(ExpjMessage msg)
	{
		addWarn(msg.getCode(), msg.getMessage(_locale));
	}

	/**
	 * 情報メッセージ追加
	 * @param msg 情報メッセージ
	 */
	public void addInfo(ExpjMessage msg)
	{
		addInfo(msg.getCode(), msg.getMessage(_locale));
	}

	/**
	 * メッセージ追加
	 * @param type メッセージのタイプ（エラー、警告、情報）
	 * @param message メッセージ
	 */
	public void addMessage(int type ,String message){
		addMessage(type ,"" , message);
	}

	/**
	 * エラーメッセージ追加
	 * @param message エラーメッセージ
	 */
	public void addError(String message)
	{
		addError("" , message);
	}

	/**
	 * 警告メッセージ追加
	 * @param message 警告メッセージ
	 */
	public void addWarn(String message)
	{
		addWarn("" , message);
	}

	/**
	 * 情報メッセージ追加
	 * @param message 情報メッセージ
	 */
	public void addInfo(String message)
	{
		addInfo("" , message);
	}


	/**
	 * メッセージ追加
	 * @param type メッセージのタイプ（エラー、警告、情報）
	 * @param code メッセージコード
	 * @param message メッセージ
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
	 * エラーメッセージ追加
	 * @param code メッセージCD
	 * @param message エラーメッセージ
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
	 * 警告メッセージ追加
	 * @param code メッセージCD
	 * @param message 警告メッセージ
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
	 * 情報メッセージ追加
	 * @param code メッセージCD
	 * @param message 情報メッセージ
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
	 * 全メッセージクリア
	 */
	public void clearAll()
	{
		_errorList.clear();
		_warnList.clear();
		_infoList.clear();
		clear();
	}

	/**
	 * メッセージクリア
	 */
	public void clear(){
		clearType();
		clearCode();
		clearMessage();
	}

	/**
	 * エラーメッセージクリア
	 */
	public void clearError()
	{
		_errorList.clear();
		RemakeMessage();
	}

	/**
	 * 警告メッセージクリア
	 */
	public void clearWarn()
	{
		_warnList.clear();
		RemakeMessage();
	}

	/**
	 * 情報メッセージクリア
	 */
	public void clearInfo()
	{
		_infoList.clear();
		RemakeMessage();
	}

	/**
	 * メッセージタイプリストのクリア
	 */
	private void clearType(){
		_typeList.clear();
	}

	/**
	 * メッセージコードリストのクリア
	 */
	private void clearCode(){
		_codeList.clear();
	}

	/**
	 * メッセージリストのクリア
	 */
	private void clearMessage(){
		_messageList.clear();
	}


	/**
	 * メッセージリストサイズ取得
	 * @return メッセージ数
	 */
	public int getSize(){
		int total = sizeError() + sizeWarn() + sizeInfo();
		if(_messageList.size() < total) {
			RemakeMessage();
		}
		return _messageList.size();
	}


	/**
	 * エラーリストサイズ取得
	 * @return エラーメッセージ数
	 */
	public int sizeError()
	{
		return _errorList.size();
	}

	/**
	 * 警告リストサイズ取得
	 * @return 警告メッセージ数
	 */
	public int sizeWarn()
	{
		return _warnList.size();
	}

	/**
	 * 情報リストサイズ取得
	 * @return 情報メッセージ数
	 */
	public int sizeInfo()
	{
		return _infoList.size();
	}

	/**
	 * メッセージ有無判別
	 * @return メッセージ有無数
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
	 * エラーメッセージ有無判別
	 * @return エラーメッセージ有無
	 */
	public boolean hasError()
	{
		return !_errorList.isEmpty();
	}

	/**
	 * 警告メッセージ有無判別
	 * @return 警告メッセージ有無
	 */
	public boolean hasWarn()
	{
		return !_warnList.isEmpty();
	}

	/**
	 * 情報メッセージ有無判別
	 * @return 情報メッセージ有無
	 */
	public boolean hasInfo()
	{
		return !_infoList.isEmpty();
	}

	/**
	 * メッセージ再構成
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

