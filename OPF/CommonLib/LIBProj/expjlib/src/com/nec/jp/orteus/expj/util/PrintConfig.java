/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/PrintConfig.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 */

package com.nec.jp.orteus.expj.util;
import java.util.ResourceBundle;

/**
 * �����`�N���X
 * metamorBase�ɂ���������`�ɃA�N�Z�X���܂��B<BR>
 * �܂��ASVF�Ŏg�p���郍�P�[���E�����G���R�[�f�B���O��Ԃ��܂��B
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.3 $
*/
public class PrintConfig {

	private static final String PRINTMODE = "PRINTMODE";
	private static final String DEFAULTPRINTMODE = "SVF";
	private static final String PDFPRINTERHEAD = "PDFPRINTER_";
	private static final String RDEPRINTERHEAD = "RDEPRINTER_";
	/**
	 * Orteus�̓��{��p���P�[��
	 *
	 */
	public static final String ORTEUS_LOCALE_JA = "ja";
	/**
	 * Orteus�̉p��p���P�[��
	 */
	public static final String ORTEUS_LOCALE_EN = "en";
	/**
	 * Orteus�̊ȑ̎�������p���P�[��
	 */
	public static final String ORTEUS_LOCALE_ZH = "zh";
	/**
	 * SVF�̓��{��p���P�[��
	 */
	public static final String SVF_LOCALE_JA = "ja";
	/**
	 * SVF�̉p��p���P�[��
	 */
	public static final String SVF_LOCALE_EN = "en";
	/**
	 * SVF�̊ȑ̎�������p���P�[��
	 */
	public static final String SVF_LOCALE_ZH = "zh_CN";
	/**
	 * SVF�̓��{��G���R�[�f�B���O
	 */
	public static final String SVF_ENCODE_MS932 = "MS932";
	/**
	 * SVF�̉p��G���R�[�f�B���O
	 */
	public static final String SVF_ENCODE_CP1252 = "Cp1252";
	/**
	 * SVF�̊ȑ̎�������G���R�[�f�B���O
	 */
	public static final String SVF_ENCODE_MS936 = "MS936";
	
	/**
	 * �R���X�g���N�^�B
	 */
	private PrintConfig(){}

	/**
	 * ������[�h�擾�B
	 * @param bundle metamorBase�̃��\�[�X�o���h��
	 * @return ������[�h�B�擾�Ɏ��s�����ꍇ��SVF��Ԃ��܂��B
	 */
	public static String getPrintMode(ResourceBundle bundle) {
		String _printMode = SystemConfig.getProperty(PRINTMODE, bundle);
		if (_printMode == null || _printMode.equals("")) {
			_printMode = DEFAULTPRINTMODE;
		}
		return _printMode;
	}
	
	/**
	 * ���P�[���ɑΉ�����PDF�v�����^�����擾���܂��B
	 *
     * @param locale ���P�[��
     * @param bundle metamorBase�̃��\�[�X�o���h��
	 * @return ���P�[���ɑΉ�����PDF�v�����^��
	 */
	public static String getPdfPrinterByLocale(String locale, ResourceBundle bundle) {
		String key = PDFPRINTERHEAD + locale.toUpperCase();
		String pdfPrinter = SystemConfig.getProperty(key, bundle);
		if (pdfPrinter == null) {
			System.out.println("(SBM1264)" + key + "�̎擾�Ɏ��s���܂����B");
		}
		return pdfPrinter;
	}

	/**
	 * ���P�[���ɑΉ�����RDE�v�����^�����擾���܂��B
     * @param locale ���P�[��
     * @param bundle metamorBase�̃��\�[�X�o���h��
	 * @return ���P�[���ɑΉ�����RDE�v�����^��
	 */
	public static String getRdePrinterByLocale(String locale, ResourceBundle bundle) {
		String key = RDEPRINTERHEAD + locale.toUpperCase();
		String rdePrinter = SystemConfig.getProperty(key, bundle);
		if (rdePrinter == null) {
			System.out.println("(SBM1264)" + key + "�̎擾�Ɏ��s���܂����B");
		}
		return rdePrinter;
	}

	/**
	 * Orteus���P�[������SVF�ɓn���G���R�[�h���擾���܂��B
	 *
	 * @param locale Orteus���P�[��
	 * @return SVF�Ŏg�p����G���R�[�h
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
			System.out.println("(SBM1265)SVF�Ŏg�p����G���R�[�h�̐ݒ�Ɏ��s���܂����B");
		}
		
		return svfEncode;
	}

	/**
	 * Orteus���P�[����SVF�Ŏg�p���郍�P�[���ɕϊ����܂��B
	 * @param locale Orteus���P�[��
	 * @return SVF�Ŏg�p���郍�P�[��
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
			System.out.println("(SBM1049)SVF�Ŏg�p���郍�P�[���̐ݒ�Ɏ��s���܂����B");
		}
		
		return svfLocale;
	}


}
