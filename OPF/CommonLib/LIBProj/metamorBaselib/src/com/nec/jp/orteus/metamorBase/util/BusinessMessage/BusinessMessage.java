//------------------------------------------------------------------------------
// (#)BusinessMessage.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/05/29 新規作成 K.Matsumoto
// 2003/06/25 Copyrightの記述修正 Y.Inada
//            前：Copyright (c) 2003 NEC informatec Systems,Ltd.
//            後：Copyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc用コメントの体裁を整える
// 2003/07/29 K.Matsumoto
//            コンピュータ名を廃止。工場コードを追加。
//            業務名を設定するメソッド名が誤っていたため修正
//            誤：setBusinessName
//            正：setBusinessOperatingName
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.BusinessMessage;

import java.util.Date;

/**
 * 業務メッセージを格納するクラス。<BR>
 *
 * @author  K.Matsumoto
 * @version 1.00
 */
public class BusinessMessage
{

	/**
	 * オブジェクトを構築する。
	 */
	public BusinessMessage(){}

	/**
	 * 業務名設定。
	 * @return 業務名
	 */
	public String getBusinessName() {
		return _businessName;
	}

	/**
	 * 工場コード取得。
	 * @return 工場コード
	 */
	public String getPlantCode() {
		return _code;
	}

	/**
	 * データ取得。
	 * @return データ
	 */
	public String getData() {
		return _data;
	}

	/**
	 * LOG識別コード取得。
	 * @return LOG識別コード
	 */
	public String getLogCode() {
		return _logCode;
	}

	/**
	 * メッセージ取得。
	 * @return メッセージ
	 */
	public String getMessage() {
		return _message;
	}

	/**
	 * メッセージ番号取得。
	 * @return メッセージ番号
	 */
	public String getMessageCode() {
		return _messageCode;
	}

	/**
	 * 実行ユーザ取得。
	 * @return 実行ユーザ
	 */
	public String getUser() {
		return _user;
	}

	/**
	 * 確認日時取得。
	 * @return 確認日時
	 */
	public Date getCheckDate() {
		return _checkDate;
	}

	/**
	 * 発生日時設定。
	 * @return 発生日時
	 */
	public Date getGenerateDate() {
		return _generateDate;
	}


	/**
	 * 業務名設定。
	 * @param businessOperatingName 業務名
	 */
	public void setBusinessOperatingName(String name) {
		_businessName = name;
	}

	/**
	 * 工場コード設定。
	 * @param code 工場コード
	 */
	public void setPlantCode(String code) {
		_code = code;
	}

	/**
	 * データ設定。
	 * @param data データ
	 */
	public void setData(String data) {
		_data = data;
	}

	/**
	 * LOG識別コード設定。
	 * @param logCode LOG識別コード
	 */
	public void setLogCode(String code) {
		_logCode = code;
	}

	/**
	 * メッセージ設定。
	 * @param message メッセージ
	 */
	public void setMessage(String message) {
		_message = message;
	}

	/**
	 * メッセージ番号設定。
	 * @param messageCode メッセージ番号
	 */
	public void setMessageCode(String code) {
		_messageCode = code;
	}

	/**
	 * 実行ユーザ設定。
	 * @param user 実行ユーザ
	 */
	public void setUser(String user) {
		_user = user;
	}

	/**
	 * 確認日時設定。
	 * @param checkDate 確認日時
	 */
	public void setCheckDate(Date date) {
		_checkDate = date;
	}

	/**
	 * 発生日時設定。
	 * @param generateDate 発生日時
	 */
	public void setGenerateDate(Date date) {
		_generateDate = date;
	}

	/** LOG識別コード */
	private String _logCode = null;

	/** 業務名 */
	private String _businessName = null;

	/** 工場コード */
	private String _code = null;

	/** メッセージ番号 */
	private String _messageCode = null;

	/** メッセージ */
	private String _message = null;

	/** データ */
	private String _data = null;

	/** 実行ユーザ */
	private String _user = null;

	/** 発生日時 */
	private Date _generateDate = null;

	/** 確認日時 */
	private Date _checkDate = null;

}
