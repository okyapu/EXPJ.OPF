/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/PrintConfig.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 */

package com.nec.jp.orteus.expj.util;
import java.util.ResourceBundle;

/**
 * 印刷定義クラス
 * metamorBaseにおける印刷定義にアクセスします。<BR>
 * また、SVFで使用するロケール・文字エンコーディングを返します。
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.3 $
*/
public class PrintConfig {

	private static final String PRINTMODE = "PRINTMODE";
	private static final String DEFAULTPRINTMODE = "SVF";
	private static final String PDFPRINTERHEAD = "PDFPRINTER_";
	private static final String RDEPRINTERHEAD = "RDEPRINTER_";
	/**
	 * Orteusの日本語用ロケール
	 *
	 */
	public static final String ORTEUS_LOCALE_JA = "ja";
	/**
	 * Orteusの英語用ロケール
	 */
	public static final String ORTEUS_LOCALE_EN = "en";
	/**
	 * Orteusの簡体字中国語用ロケール
	 */
	public static final String ORTEUS_LOCALE_ZH = "zh";
	/**
	 * SVFの日本語用ロケール
	 */
	public static final String SVF_LOCALE_JA = "ja";
	/**
	 * SVFの英語用ロケール
	 */
	public static final String SVF_LOCALE_EN = "en";
	/**
	 * SVFの簡体字中国語用ロケール
	 */
	public static final String SVF_LOCALE_ZH = "zh_CN";
	/**
	 * SVFの日本語エンコーディング
	 */
	public static final String SVF_ENCODE_MS932 = "MS932";
	/**
	 * SVFの英語エンコーディング
	 */
	public static final String SVF_ENCODE_CP1252 = "Cp1252";
	/**
	 * SVFの簡体字中国語エンコーディング
	 */
	public static final String SVF_ENCODE_MS936 = "MS936";
	
	/**
	 * コンストラクタ。
	 */
	private PrintConfig(){}

	/**
	 * 印刷モード取得。
	 * @param bundle metamorBaseのリソースバンドル
	 * @return 印刷モード。取得に失敗した場合はSVFを返します。
	 */
	public static String getPrintMode(ResourceBundle bundle) {
		String _printMode = SystemConfig.getProperty(PRINTMODE, bundle);
		if (_printMode == null || _printMode.equals("")) {
			_printMode = DEFAULTPRINTMODE;
		}
		return _printMode;
	}
	
	/**
	 * ロケールに対応したPDFプリンタ名を取得します。
	 *
     * @param locale ロケール
     * @param bundle metamorBaseのリソースバンドル
	 * @return ロケールに対応したPDFプリンタ名
	 */
	public static String getPdfPrinterByLocale(String locale, ResourceBundle bundle) {
		String key = PDFPRINTERHEAD + locale.toUpperCase();
		String pdfPrinter = SystemConfig.getProperty(key, bundle);
		if (pdfPrinter == null) {
			System.out.println("(SBM1264)" + key + "の取得に失敗しました。");
		}
		return pdfPrinter;
	}

	/**
	 * ロケールに対応したRDEプリンタ名を取得します。
     * @param locale ロケール
     * @param bundle metamorBaseのリソースバンドル
	 * @return ロケールに対応したRDEプリンタ名
	 */
	public static String getRdePrinterByLocale(String locale, ResourceBundle bundle) {
		String key = RDEPRINTERHEAD + locale.toUpperCase();
		String rdePrinter = SystemConfig.getProperty(key, bundle);
		if (rdePrinter == null) {
			System.out.println("(SBM1264)" + key + "の取得に失敗しました。");
		}
		return rdePrinter;
	}

	/**
	 * OrteusロケールからSVFに渡すエンコードを取得します。
	 *
	 * @param locale Orteusロケール
	 * @return SVFで使用するエンコード
	 */
	public static String getSvfEncodeByLocale(String locale) {
		String svfEncode = null;
		
		if (locale.equals(ORTEUS_LOCALE_JA)) {
				svfEncode = SVF_ENCODE_MS932;
		} else if (locale.equals(ORTEUS_LOCALE_EN)) {
			svfEncode = SVF_ENCODE_CP1252;
		} else if (locale.equals(ORTEUS_LOCALE_ZH)) {
				svfEncode = SVF_ENCODE_MS936;
		}
		
		if (svfEncode == null) {
			System.out.println("(SBM1265)SVFで使用するエンコードの設定に失敗しました。");
		}
		
		return svfEncode;
	}

	/**
	 * OrteusロケールをSVFで使用するロケールに変換します。
	 * @param locale Orteusロケール
	 * @return SVFで使用するロケール
	 */
	public static String convertOrteusLocaleToSvfLocale(String locale) {
		String svfLocale = null;
		
		if (locale.equals(ORTEUS_LOCALE_JA)) {
				svfLocale = SVF_LOCALE_JA;
		} else if (locale.equals(ORTEUS_LOCALE_EN)) {
			svfLocale = SVF_LOCALE_EN;
		} else if (locale.equals(ORTEUS_LOCALE_ZH)) {
				svfLocale = SVF_LOCALE_ZH;
		}
		
		if (svfLocale == null) {
			System.out.println("(SBM1049)SVFで使用するロケールの設定に失敗しました。");
		}
		
		return svfLocale;
	}


}
