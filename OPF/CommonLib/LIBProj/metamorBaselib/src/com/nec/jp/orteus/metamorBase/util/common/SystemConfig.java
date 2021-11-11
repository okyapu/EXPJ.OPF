//------------------------------------------------------------------------------
// (#)SystemConfig.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/05/30 新規作成 Y.Inada
// 2003/06/25 Copyrightの記述修正 Y.Inada
//            前：Copyright (c) 2003 NEC informatec Systems,Ltd.
//            後：Copyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc用コメントの体裁を整える
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.common;

import java.util.ResourceBundle;
import java.util.MissingResourceException;
import java.lang.ClassLoader;
import java.util.Locale;

/**
  * システム定義。
  * システム定義は、metamorBaseにおけるシステム定義ファイルに
  * アクセスするための機能である。<BR>
  * また、metamorBase上の各種定義ファイルへのアクセスを可能とする。
  * 
  * @author Y.Inada
  * @version 1.00
*/
public class SystemConfig
{

	/**
	 * コンストラクタ。
	 */
	private SystemConfig(){}

	/**
	  * リソースバンドル取得。
	  * @return リソースバンドル
	  * @throws MissingResourceException リソースが欠落
	 */
	public static ResourceBundle getBundle() throws MissingResourceException
	{
		try {
			// 定義ファイル用意
			ResourceBundle bundle =
					ResourceBundle.getBundle(_systemFileName);
			return bundle;
		}catch(MissingResourceException ex) {
			return null;
		}
	}

	/**
	  * リソースバンドル取得施。
	  * @param local ロケール
	  * @return リソースバンドル
	 */
	public static ResourceBundle getBundle(Locale local)
	{
		try {
			// 定義ファイル用意
			ResourceBundle bundle =
					ResourceBundle.getBundle(_systemFileName, local);
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
	  * @throws MissingResourceException リソースが欠落
	 */
	public static ResourceBundle getBundle(Locale local, ClassLoader loader)
			throws MissingResourceException
	{
		try {
			// 定義ファイル用意
			ResourceBundle bundle =
					ResourceBundle.getBundle(_systemFileName, local, loader);
			return bundle;
		}catch(MissingResourceException ex) {
			return null;
		}
	}

	/**
	  * 値取得。
	  * @param key 取得キー
	  * @param bundle リソースバンドル
	  * @param String 値(取得に失敗した場合はnull)
	 */
	public static String getProperty(String key, ResourceBundle bundle)
	{
		if(key == null || bundle == null)
			return null;

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
	  * @param Integer 値(取得に失敗した場合はnull)
	 */
	public static Integer getPropertyNumber(String key, ResourceBundle bundle)
	{
		String value = getProperty(key, bundle);
		if(null == value)
			return null;
		Integer ret = null;
		try {
			ret = Integer.valueOf(value);
		}
		catch(NumberFormatException ex) {
			return null;
		}
		return ret;
	}

	/** システム定義ファイル名。*/
	private static final String _systemFileName = "metamorBaseSystem";
}

