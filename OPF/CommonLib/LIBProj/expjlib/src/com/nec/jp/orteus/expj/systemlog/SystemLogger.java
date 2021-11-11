/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/systemlog/SystemLogger.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.systemlog;

import com.nec.jp.orteus.util.logging.LogManager;
import com.nec.jp.orteus.util.logging.Logger;
import com.nec.jp.orteus.util.logging.Level;

/**
 * システムログを出力する(Loggerの再定義)
 * 
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:09 $
 */
public class SystemLogger extends Logger
{
	/**
	  * _loggerSync		ロッガー生成のための排他オブジェクト
	  */
	private static Object _loggerSync = new Object();

	/**
	 * ロッガー作成。<br>
     * ロッガーを作成し、ログマネージャに登録します。
     * 
	 * @param  category カテゴリ名
	 * @param  level 出力レベル
	  * @return true:作成成功　false:作成失敗
	 */
    public static boolean makeLogger(String category, Level level)
    {
		boolean ret = false;
	    synchronized(_loggerSync)
        {
	        LogManager logmanager = LogManager.getLogManager();
			SystemLogger logger = new SystemLogger(category, null);
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
	 * 
	 * @param  s カテゴリ名
	 * @param  s1 リソースバンドル名
	 */
    public void entering(String s, String s1)
    {
		// 何もしない
    }

	/**
	 * ENTRYログ出力(再定義)。
	 * 
	 * @param  s カテゴリ名
	 * @param  s1 リソースバンドル名
	 * @param  aobj
	 */
    public void entering(String s, String s1, Object aobj[])
    {
		// 何もしない
    }

	/**
	 * EXITログ出力(再定義)。
	 * 
	 * @param  s カテゴリ名
	 * @param  s1 リソースバンドル名
	 */
    public void exiting(String s, String s1)
    {
		// 何もしない
    }

	/**
	 * EXITログ出力(再定義)。
	 * 
	 * @param  s カテゴリ名
	 * @param  s1 リソースバンドル名
	 * @param  obj オブジェクト
	 */
    public void exiting(String s, String s1, Object obj)
    {
		// 何もしない
    }

	/**
	 * THROWログ出力(再定義)。
	 * 
	 * @param  s カテゴリ名
	 * @param  s1 リソースバンドル名
	 * @param  throwable throw
	 */
    public void throwing(String s, String s1, Throwable throwable)
    {
		// 何もしない
    }

	/**
	 * ロッガーの構築
	 * 
	 * @param name Logger の名前
	 * @param resourceBundleName ResourceBundle の名前
	*/
	public SystemLogger(String name, String resourceBundleName)
	{
		super(name, resourceBundleName);
	}

}

