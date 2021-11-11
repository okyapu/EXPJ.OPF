/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/systemlog/SystemLogFilter.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.systemlog;

import com.nec.jp.orteus.util.logging.LogRecord;
import com.nec.jp.orteus.util.logging.Filter;


/**
 * 出力可否制御を実施
 * 
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:09 $
 */
public class SystemLogFilter implements Filter
{
	/**
	 * メンバ変数の定義
	 *
	 */
	private String _category = null;

	/**
	 * オブジェクトを構築する。
	 * @param  category カテゴリ
	 */
	public SystemLogFilter(String category){
		_category = new String(category);
	}

	/**
	 * 出力可否判定。
	 * 
	 * @param  logrecord ログレコード
	 * @return 出力する：true  出力しない：false
	 */
	public boolean isLoggable(LogRecord logrecord)
	{
		if (logrecord.getLoggerName().equals(_category) == true) {
			return true;
		}

		return false;
	}

}

