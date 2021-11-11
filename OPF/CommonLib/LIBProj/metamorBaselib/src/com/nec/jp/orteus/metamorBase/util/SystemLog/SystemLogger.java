//------------------------------------------------------------------------------
// (#)SystemLogger.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/05/22 新規作成 M.Sakamoto
// 2003/06/25 Copyrightの記述修正 Y.Inada
//            前：Copyright (c) 2003 NEC informatec Systems,Ltd.
//            後：Copyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc用コメントの体裁を整える
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.SystemLog;

import com.nec.jp.orteus.util.logging.LogManager;
import com.nec.jp.orteus.util.logging.Logger;
import com.nec.jp.orteus.util.logging.Level;

/**
 * システムログを出力する(Loggerの再定義)<BR>
 *
 * @author  M.Sakamoto
 * @version 1.00
 */
public class SystemLogger extends Logger
{
	/**
	 * ロッガー作成。<BR>
     * ロッガーを作成し、ログマネージャに登録する
	 * @param  category カテゴリ名
	 * @param  level 出力レベル
	 */
    public static boolean makeLogger(String s, Level level)
    {
		boolean ret = false;
	    synchronized(_loggerSync)
        {
	        LogManager logmanager = LogManager.getLogManager();
			SystemLogger logger = new SystemLogger(s, null);
			boolean flag = logmanager.addLogger(logger);
			if(true == flag) {
				logger.setLevel(level);
				ret = true;		// 生成完了
			}
		}
		return ret;
    }

	/* 出力不可メソッドの再定義 */

	/**
	 * ENTRYログ出力(再定義)。
	 * @param  s カテゴリ名
	 * @param  s1 リソースバンドル名
	 */
    public void entering(String s, String s1)
    {
		// 何もしない
    }

	/**
	 * ENTRYログ出力(再定義)。
	 * @param  s カテゴリ名
	 * @param  s1 リソースバンドル名
	 */
    public void entering(String s, String s1, Object aobj[])
    {
		// 何もしない
    }

	/**
	 * EXITログ出力(再定義)。
	 * @param  s カテゴリ名
	 * @param  s1 リソースバンドル名
	 */
    public void exiting(String s, String s1)
    {
		// 何もしない
    }

	/**
	 * EXITログ出力(再定義)。
	 * @param  s カテゴリ名
	 * @param  s1 リソースバンドル名
	 */
    public void exiting(String s, String s1, Object obj)
    {
		// 何もしない
    }

	/**
	 * THROWログ出力(再定義)。
	 * @param  s カテゴリ名
	 * @param  s1 リソースバンドル名
	 */
    public void throwing(String s, String s1, Throwable throwable)
    {
		// 何もしない
    }

	/**
	 * ロッガーの構築
	 * @param filename ログファイルのパス
	 * @param limit ログファイル切り替えサイズ
	 * @param count ログファイルバックアップ数
	*/
	public SystemLogger(String name, String resourceBundleName)
	{
		super(name, resourceBundleName);
	}

	/**
      * _loggerSync		ロッガー生成のための排他オブジェクト
	*/
    private static Object _loggerSync = new Object();
}

