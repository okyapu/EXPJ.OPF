/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/systemlog/SystemLogCommon.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.systemlog;

/**
 * システムログ共通定義。
 * 
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:09 $
*/
public class SystemLogCommon
{
	/** 
	 * 共通カテゴリ。
	 */
	public final static String COMMON_CATEGORY = "com.nec.jp.orteus.metamorBase";

	/** 
	 * 出力先定義ファイルパス。
	 */
	public final static String HANDLER_PROPERTIES = "SystemLog";

	/** 
	 * アプリケーション定義ファイルパス。
	 */
	public final static String APPRICATION_PROPERTIES = "SystemLogApplication";

	/** 
	 * 開発環境。
	 */
	public static final int ENVIRONMENT_DEVELOPMENT = 1;

	/** 
	 * 運用環境。
	 */
	public static final int ENVIRONMENT_EMPLOYMENT = 11;

	/** 
	 * 不定環境。
	 */
	public static final int ENVIRONMENT_UNKOWN = 99;

	/** 
	 * メッセージ取得ファイル 
	 */
	public final static String MESSAGE_PROPERTIES_FILE = "ExpjMessage";
	
}

