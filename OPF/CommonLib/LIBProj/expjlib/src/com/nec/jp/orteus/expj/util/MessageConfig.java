/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/MessageConfig.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

import java.util.ResourceBundle;
import java.util.MissingResourceException;
import java.util.List;

/**
 * メッセージ定義クラス。
 * メッセージ定義は、metamorBaseにおけるメッセージ定義ファイルにアクセスするための機能です。
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:12 $
 */
public class MessageConfig {


	/** 
	 * メッセージ定義ファイル名。
	 */
	private static final String fileName = "ExpjMessage";

	/** 
	 * インスタンス。 
	 */
	private static MessageConfig _msgConfig = new MessageConfig();

	/** 
	 * リソースバンドル。 
	 */
	private static ResourceBundle _bundle = null;
	
	/**
	  * コンストラクタ
	 */
	private MessageConfig(){}

	/**
	  * インスタンス取得
	 */
	public static MessageConfig getInstance()
	{
		return _msgConfig;
	}

	/**
	 * 初期化処理
	 * @return true: 初期化成功 false: 初期化失敗
	 */
	public synchronized static boolean init()
	{
		if (_bundle == null){
			try {
				// 定義ファイル用意
				ResourceBundle bundle =	ResourceBundle.getBundle(fileName);
				_bundle = bundle;
	
			}catch(MissingResourceException ex){
				_bundle = null;
				return false;
			}
		}
		return true;
	}

	/**
	  * メッセージを追加します。
	  * @param key 取得キー
	  * @param list メッセージ格納用のリスト
	 */
	public synchronized static void addMessage(String key, List list)
	{
		if (list == null) {
			return;
		} 
		
		// メッセージ取得
		String msg = getMessage(key);
		if (msg != null) {
			list.add(msg); 
		} 
		else {
			list.add("メッセージキー[" + key + "]に対応するメッセージがありません");
		} 
	}

	/**
	  * メッセージを取得します。
	  * @param key 取得キー
	  * @return 取得したメッセージを返します。
	 */
	public synchronized static String getMessage(String key)
	{
		String msg = null;

		if (key == null || _bundle == null) {
			return msg;
		} 
		try {
			msg = _bundle.getString(key);

		}catch(MissingResourceException ex){
		}

		return msg;
	}


}

