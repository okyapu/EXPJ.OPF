//------------------------------------------------------------------------------
// (#)SystemLogFormatter.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/05/30 新規作成 M.Sakamoto
// 2003/06/25 Copyrightの記述修正 Y.Inada
//            前：Copyright (c) 2003 NEC informatec Systems,Ltd.
//            後：Copyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc用コメントの体裁を整える
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.SystemLog;

import java.io.StringWriter;
import java.io.PrintWriter;
import java.lang.StringBuffer;

import com.nec.jp.orteus.util.logging.SimpleFormatter;
import com.nec.jp.orteus.util.logging.LogRecord;


/**
  * フォーマッター
  *
  * @author  M.Sakamoto
  * @version 1.00
*/
public class SystemLogFormatter extends SimpleFormatter
{
	/**
	  * ログ文字列のフォーマット(SimpleFormatter::format()の再定義)。
	  * @param record ログ情報レコード
	  * @return ログ文字列
	*/
	public String format(LogRecord record)
	{
		// レベル文字列の加工(7文字に満たない場合、スペース詰)
		StringBuffer level = new StringBuffer(super.getLevel(record));
		while(level.length() < 7) {
			level.append(" ");
		}

		// 文字列作成(開発環境/運用環境共通)
		StringBuffer buff = new StringBuffer(0);
		buff.append(super.getTime(record));
		buff.append(" ");
		buff.append(level.toString());
		buff.append("- ");
		buff.append(record.getMessage());

		// 開発環境の場合、付加情報出力(ファイル名/行番号)
		if(_environment == SystemLogCommon.ENVIRONMENT_DEVELOPMENT) {
			buff.append(formatDevelopmentInfo(record));
		}

		return buff.toString();
	}

	/**
	  * 開発環境用の付加情報(ソース名/行番号)を取得する。
	  * @param record ログ情報レコード
	  * @return ログ文字列
	*/
	private String formatDevelopmentInfo(LogRecord record)
	{
		int ibegin = 0;
		int iend = 0;
		String stacktrace = null;
		String traceinfo = null;

		// スタックトレース情報取得
		Throwable throwinfo = new Throwable();
		synchronized(_swriter) {
			throwinfo.printStackTrace(_pwriter);
			stacktrace = _swriter.toString();
			_swriter.getBuffer().setLength(0);
		}

		ibegin = stacktrace.lastIndexOf(super.getSourceClassName(record));

		if(ibegin == -1)
			return "";	// 見つからないため、終了
		ibegin = stacktrace.indexOf(LINE_SEP, ibegin);
		if(ibegin == -1)
			return "";	// 見つからないため、終了
		ibegin += LINE_SEP_LEN;
		iend = stacktrace.indexOf(LINE_SEP, ibegin);
		if(iend == -1)
			return "";	// 見つからないため、終了
		traceinfo = stacktrace.substring(ibegin, iend);
		if(traceinfo == null)
			return "";	// 見つからないため、終了

		// ファイル名/行番号情報取得
		String file = null;
		String line = null;
		iend = traceinfo.lastIndexOf(':');
		if(iend == -1)
			return "";	// 見つからないため、終了
		ibegin = traceinfo.lastIndexOf('(', iend-1);
		file = traceinfo.substring(ibegin+1, iend);
		iend = traceinfo.lastIndexOf(')');
		ibegin = traceinfo.lastIndexOf(':', iend-1);
		if(ibegin == -1)
			return "";	// 見つからないため、終了
		line = traceinfo.substring(ibegin+1, iend);

		// 情報返却
		StringBuffer buff = new StringBuffer(0);
		buff.append(" (");
		buff.append(file);
		buff.append(":");
		buff.append(line);
		buff.append(")");

		return buff.toString();
	}

	/**
	  * フォーマッターの構築。
	  * @param environment 環境を指定
	*/
	public SystemLogFormatter(int environment)
	{
		super();
		_environment = environment;
	}

	/** システムのラインセパレータ */
	private final static String LINE_SEP = System.getProperty("line.separator");

	/** システムのラインセパレータ長 */
	private final static int LINE_SEP_LEN = LINE_SEP.length();

	/** スタックトレース取得用のStringWriter */
	private StringWriter _swriter = new StringWriter();

	/** スタックトレース取得用のPrintWriter */
	private PrintWriter _pwriter = new PrintWriter(_swriter);

	/** m_environment 実行環境(開発環境/運用環境) */
	private  int _environment = SystemLogCommon.ENVIRONMENT_UNKOWN;
}

