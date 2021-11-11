/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/SystemConfig.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

import java.util.ResourceBundle;
import java.util.MissingResourceException;
import java.util.Locale;

/**
 * システム定義クラス。
 * システム定義は、metamorBaseにおけるシステム定義ファイルにアクセスするための機能です。<BR>
 * また、metamorBase上の各種定義ファイルへのアクセスを可能とします。
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:14 $
*/
public class SystemConfig {

	/** 
	 * システム定義ファイル名。
	 */
	private static final String systemFileName = "metamorBaseSystem";
	
	/**
	 * コンストラクタ。
	 */
	private SystemConfig(){}

	/**
	  * リソースバンドル取得。
	  * @return リソースバンドル
	 */
	public static ResourceBundle getBundle()
			throws MissingResourceException {
		try {
			// 定義ファイル用意
			ResourceBundle bundle = ResourceBundle.getBundle(systemFileName);
			return bundle;
		}catch(MissingResourceException ex) {
			return null;
		}
	}

	/**
	  * リソースバンドル取得。
	  * @param local ロケール
	  * @return リソースバンドル
	 */
	public static ResourceBundle getBundle(Locale local)
			throws MissingResourceException {
		try {
			// 定義ファイル用意
			ResourceBundle bundle =	ResourceBundle.getBundle(systemFileName, local);
			return bundle;
		}catch(MissingResourceException ex) {
			return null;
		}
	}

	/**
	  * リソースバンドル取得。
	  * @param local ロケール
	  * @param loader クラスローダ
	  * @return リソースバンドル
	 */
	public static ResourceBundle getBundle(Locale local, ClassLoader loader)
			throws MissingResourceException {
		try {
			// 定義ファイル用意
			ResourceBundle bundle =	ResourceBundle.getBundle(systemFileName, local, loader);
			return bundle;
		}catch(MissingResourceException ex) {
			return null;
		}
	}

	/**
	  * 値取得。
	  * @param key 取得キー
	  * @param bundle リソースバンドル
	  * @return 取得した値を String で返します。取得に失敗した場合は null を返します。
	 */
	public static String getProperty(String key, ResourceBundle bundle)
			throws MissingResourceException {
		if (key == null || bundle == null) {
			return null;
		}

		try {
			return bundle.getString(key);
		}
		catch(MissingResourceException ex) {
			return null;
		}
	}

	/**
	  * 値取得。
	  * @param key 取得キー
	  * @param bundle リソースバンドル
	  * @return 取得した値を Integer で返します。取得に失敗した場合は null を返します。
	 */
	public static Integer getPropertyNumber(String key, ResourceBundle bundle)
			throws MissingResourceException {
		String value = getProperty(key, bundle);
		if (null == value) {
			return null;
		}
		Integer ret = null;
		try {
			ret = Integer.valueOf(value);
		}
		catch(NumberFormatException ex) {
			return null;
		}
		return ret;
	}

}

