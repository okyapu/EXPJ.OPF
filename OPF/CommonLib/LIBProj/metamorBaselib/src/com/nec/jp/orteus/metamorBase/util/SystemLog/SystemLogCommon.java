//------------------------------------------------------------------------------
// (#)SystemLogCommon.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/05/30 新規作成 M.Sakamoto
// 2003/06/25 Copyrightの記述修正 Y.Inada
//            前：Copyright (c) 2003 NEC informatec Systems,Ltd.
//            後：Copyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc用コメントの体裁を整える
// 2003/10/08 メッセージ取得ファイル定義追加  K.Shiraki
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.SystemLog;


/**
 * システムログ共通定義。
 *
 * @author  M.Sakamoto
 * @version 1.00
*/
public class SystemLogCommon
{
	/** 共通カテゴリ。*/
	public final static String COMMON_CATEGORY = "com.nec.jp.orteus.metamorBase";

	/** 出力先定義ファイルパス。*/
	public final static String HANDLER_PROPERTIES = "SystemLog";

	/** アプリケーション定義ファイルパス。*/
	public final static String APPRICATION_PROPERTIES = "SystemLogApplication";

	/** 開発環境。*/
	public static final int ENVIRONMENT_DEVELOPMENT = 1;

	/** 運用環境。*/
	public static final int ENVIRONMENT_EMPLOYMENT = 11;

	/** 不定環境。*/
	public static final int ENVIRONMENT_UNKOWN = 99;

	/** メッセージ取得ファイル */
	public final static String MESSAGE_PROPERTIES_FILE = "AlarmMessage";
}

